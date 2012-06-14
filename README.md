# Zuericher Hochschule angewandter Wissenschaften
# Software Projekt 2

## Miro Ljubicic & Mathias Weigert

**15. März 2012**

- Hauptstruktur erstellt *(MW)*
- Klasse Filechooser erstellt *(MW)*
- Klasse ExceptionDisplay erstellt *(MW)*

**16. März 2012**
         
- TestKlasse TestExceptionDisplay erstellt *(MW)*
- Klasse FrequencyAnalyzer erstellt *(MW)*
- Klasse LoadTextFile erstellt *(MW)*
- TestKlasse TestLoadTextFile erstellt *(MW)*
- TestKlasse TestFrequencyAnalyzer erstellt *(MW)*

**17. März 2012** 

- FrequencyAnalyzer kann nun Zeichen zählen, den prozentualen Anteil berechnen in 
  welchem die Zeichen Auftreten *(MW)*
  
**18. März 2012**

- Klasse KryptoFrame erstellt *(MW)*
- TestKlasse TestKryptoFrame erstellt *(MW)*
- Klasse MainMenuBar erstellt, File- & Help *(MW)*
- Menu hinzugefügt  *(MW)*
- Klasse VersionInformation erstellt *(MW)*
- Klasse VersionListener erstellt *(MW)*
- Klasse ExitListener erstellt *(MW)*
- Klasse LoadListener erstellt *(MW)*

**19. Mrz. 2012**

- Klasse CaesarBruteForce erstellt *(MW)*
- TestKlasse TestCaesarBruteForce erstellt *(MW)*

**20. März 2012**

- Klasse CaesarEncrypt erstellt *(MW)*
- TestKlasse TestCaesarEncrypt erstellt. *(MW)*

**22. März 2012** 

- Minor Bug fixed in CaesarEncrypt. *(MW)*
- Klasse CaesarPanel erstellt. *(MW)*
- CaesarBruteForce misst die Zeit welche zum knacken benötigt wird. *(MW)*

**23. März 2012**

- CaesarEncrypt verwendet nun einen schoeneren Algorithmus. *(MW)*
- Klasse SkytaleEncrypt hinzugefügt. *(MW)*

**25. März 2012**

- Kleiner Bugfix in neuem CaesarEncrypt Algorithmus. *(MW)*

**26. März 2012**

- Klasse SetSpaces hinzugefügt. *(MW)*
- TestKlasse TestSetSpaces hinzugefügt. *(MW)*

**28. März 2012** 

- Dokumentation nach GitHub verschoben für besseres Tracking *(ML)*

**01. April 2012**

 - Pivotal aktualisiert *(ML)*
 
**01. April 2012**
- Dokumentation neu begonnen, da die Formatvorlagen in Word
  das Arbeiten unnötig komplizieren
  Einige Grundlagen zum Dokumentieren:
  - Formatieren nur wenn unbedingt nötig (math. Formeln, Fett, Kursiv, etc.)
  - das "Finish" wird in der letzten Iteration fixiert
  - jede externe Quelle direkt beim zitierten Text einfügen
    (wird später ins richtige Quellenverzeichnis eingefügt) *(ML)*
    
**03. April 2012**
 
- Dokumentation aktualisiert *(ML)*
 
**04. April 2012**

- FixSpacesListener hinzugefügt. *(MW)*
- CaesarPanel fertiggestellt. *(MW)*
- CaesarEncryptListener erstellt. *(MW)*
- CaesarDecryptListener erstellt. *(MW)*

**04. April 2012**

- Dokumentation aktualisiert (Kryptoanalyse und Vigènere) *(ML)*

##1. Iteration Mittwoch 4. April 2012

###+++ Wegen Krankheit, Urlaub und Lernstress total verhauen +++
###       Velocity voll ausgenutzt (Winterspeck ist weg!)

##2. Iteration Dienstag 1. Mai 2012

**05. April 2012**

- Klasse SkytalePanel erstellt. *(MW)*

**07. April 2012**

- Kleiner Fehler in CaesarEncrypt gefixt. *(MW)*

**09. April 2012**

- CaesarPanel "neues" Design verpasst, was zu einer besseren
  Uebersicht führen soll. *(MW)*
- Klasse TextToString erstellt. *(MW)*
 
**15. Mai 2012**

- Klasse Kryptonite erstellt (Main GUI mit JavaFX 2.1) *(MW)*
- Klasse MainTree erstellt (dient der Navigation im GUI) *(MW)*
- Klasse MainMenu erstellt *(MW)*
- Klasse InfoPanelFX erstellt *(MW)*
 
**16. Mai 2012**

- Rechtschreibkorrektur in MainTree *(MW)*
- Klasse CaesarPanelFX erstellt Design ist fertig; noch keine Funktionalität *(MW)*

**23. Mai 2012**

- ToggleGroup für RadioButtons in CaesarPanelFX erstellt *(MW)*
- Klasse FixSpacesEvent erstellt und implementiert *(MW)*
- Klasse NoSpacesEvent erstellt und implementiert *(MW)*
- Klasse CaesarEncryptEvent erstellt und implementiert *(MW)*
- Dokumentation erweitert und neue UMLs generiert *(MW)*
- Klasse CaesarDecryptEvent erstellt und implementiert *(MW)*

##3. Iteration Mittwoch 23. Mai 2012

**24. Mai 2012**

- Clean-UP von unbenutzten Klassen nach Migration zu JavaFX *(MW)*
- Klasse MainPanelFX erstellt. *(MW)*
- Klassen CaesarHeader und CaesarLeft erstellt *(MW)*

**25. Mai 2012**

- ReadMe von Text zu MarkDown migriert *(MW)*
- Klasse Version2 erstellt
  Es gibt Probleme mit der Migration zu Code der einen besseren
  objekt orientierten Ansatz verfolgt. Kryptonite funktioniert noch
  mit den "alten" JavaFX Klassen. Version2 dient dazu die neuen Klassen des 
  GUI zu testen. Momentan macht aber die zukünftige GUI Klasse MainPanelFX sorgen. *(MW)*


**30. Mai 2012**

- Kryptonite angepasst, so das MainTreeChangeListener funktionert *(MW)*
- Kleinerer Bugfix in CaesarBruteForce *(MW)*

**09. Juni 2012**

- Enum Alphabet erstellt, in welchen die Häufigkeitsverteilung der Buchstaben
  in deutschen Texten hinterlegt ist. *(MW)*
- Klasse FrequencyChart implementiert und Funktion überprüft. *(MW)*
- Test Text File mit Plaintext hinzugefügt. *(MW)*

**10. Juni 2012**

- CaesarPanelFX und entsprechende Eventhandler so angepasst, das nun die komplette
  Ausgabe in der GUI erfolgt. *(MW)*
- Hauptmenu kann nun die GUI schliesen. *(MW)*
- Haputmenu durch VersionListener und ExitListener die entsprechenden
  Funktionen hinzugefügt. *(MW)*

**11. Juni 2012**

- Kryptonite angepasst um mehr funktionalität und felxibilität in die 
  GUI zu bekommen. *(MW)*
- MainTreeChangeListener und VersionListener angepasst, das Sie mit neuer
  GUI Architektur funktionieren. *(MW)*
- Größere GUI Architektur Änderungen angefangen -> Verlust der Funktion im 
  Moment *(MW)*

**12. Juni 2012**

- Allgemein mehrere Klassen angepasst (vor allem EventListener & Panels) damit
  die neue GUI Architektur wieder funktioniert. *(MW)*

**13. Juni 2012**

- Caesar Cipher komplett implementiert. *(MW)*
- Rechtes Panel für Substitution Cipher implementiert. *(MW)*
- Ungenützte "alte" Klassen deleted. *(MW)*
- Klassen CharacterMapper und CharacterMapperTest erzeugt für die monoalphabetischen Mappings *(ML)*

**14. Juni 2012**

- Großes Refactoring der GUI Klassen (mit Augenmerk auf die Eventhandler) *(MW)*
- Bugfixing bei FrequencyAnalyzer, zählt nun die Spaces nicht mehr mit. *(MW)*
- FrequencyAnalyzer liefert nun eine für die Weiterverarbeitung formatierte MAP. *(MW)*

#
#Präsentation des Projekts 15. Juni 2012