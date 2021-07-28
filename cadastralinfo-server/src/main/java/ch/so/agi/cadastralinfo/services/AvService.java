package ch.so.agi.cadastralinfo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;

import ch.so.geo.schema.agi.cadastre._0_9.extract.Extract;
import ch.so.geo.schema.agi.cadastre._0_9.extract.GetExtractByIdResponse;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.xml.bind.Marshaller;
import javax.xml.transform.stream.StreamSource;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class AvService {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    Jaxb2Marshaller marshaller;

    public GetExtractByIdResponse getParcel(String egrid) throws IOException {
        String tmpdir = Files.createTempDirectory("cadastralinfo").toFile().getAbsolutePath();
        
        InputStream resource = new ClassPathResource("CH955832730623.xml").getInputStream();        
        File targetFile = Paths.get(tmpdir, egrid + ".xml").toFile();
        Files.copy(resource,targetFile.toPath(),StandardCopyOption.REPLACE_EXISTING);
        IOUtils.closeQuietly(resource);
        
        log.info(targetFile.getAbsolutePath());

        StreamSource xmlSource = new StreamSource(targetFile);
        GetExtractByIdResponse obj = (GetExtractByIdResponse) marshaller.unmarshal(xmlSource);
        Extract xmlExtract = obj.getExtract();
        
        
        
        
        ObjectMapper mapper = new ObjectMapper();  
        AnnotationIntrospector introspector = new JaxbAnnotationIntrospector(mapper.getTypeFactory());
        mapper.setAnnotationIntrospector(introspector);

        String result = mapper.writeValueAsString(obj);
        //log.info(result);
        
        return obj;

    } 
}
