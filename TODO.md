## TODO
- Exceptionhandling (v.a. im GUI)

- Suche (fetch) im Hauptfenster: Wie oft muss das gemacht werden? Kann copy/past Code verhindert werden?
- Wie XXXElement strukturieren? Kann man etwas verallgemeinern (vererben)? Ablauf? Daten holen, parsen, rendern? "Cards" im Konstruktor und Hauptdiv erst sichbar machen, wenn alles fertig?
- ...
- clear all Button
  * Hat "resetIcon"-Button auch (oder nur dieser) dieses Verhalten?
  * resetIcon nicht sauber zentriert
- nested fetch -> then()

- Das Ganze braucht jetzt wirklich ein Refactoring. Vor allem bezüglich der fetch()/Ajax-Logik. Wie robust ist es? Suchform müsste auch noch disabled werden. Ebenso müssen alle fetch() behandelt werden. 



- GBDBS
  * Mehr Testfälle. Anschliessend überlegen wie XML geparsed wird (resp. welche Klassen benötigt werden)
  * ...
- AV
  * JSON über Bord werfen und XML verwenden
  * Clear/reset elements. Funktioniert chaotisch. Alles gleich machen beim Refactoring.

- ÖREB:
  * XMLUtils: Auslesen einer bestimmten Sprache
  * Sind die Layer sichbar, falls ein anderes Thema aktiviert ist?



- native-image:
  * resources/META-INFO? (-> archetype?)
  * inject fields