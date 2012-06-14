# Zuericher Hochschule angewandter Wissenschaften
# Software Projekt 2

## Miro Ljubicic & Mathias Weigert

**15. M�rz 2012**

- Hauptstruktur erstellt *(MW)*
- Klasse Filechooser erstellt *(MW)*
- Klasse ExceptionDisplay erstellt *(MW)*

**16. M�rz 2012**
         
- TestKlasse TestExceptionDisplay erstellt *(MW)*
- Klasse FrequencyAnalyzer erstellt *(MW)*
- Klasse LoadTextFile erstellt *(MW)*
- TestKlasse TestLoadTextFile erstellt *(MW)*
- TestKlasse TestFrequencyAnalyzer erstellt *(MW)*

**17. M�rz 2012** 

- FrequencyAnalyzer kann nun Zeichen z�hlen, den prozentualen Anteil berechnen in 
  welchem die Zeichen Auftreten *(MW)*
  
**18. M�rz 2012**

- Klasse KryptoFrame erstellt *(MW)*
- TestKlasse TestKryptoFrame erstellt *(MW)*
- Klasse MainMenuBar erstellt, File- & Help *(MW)*
- Menu hinzugef�gt  *(MW)*
- Klasse VersionInformation erstellt *(MW)*
- Klasse VersionListener erstellt *(MW)*
- Klasse ExitListener erstellt *(MW)*
- Klasse LoadListener erstellt *(MW)*

**19. Mrz. 2012**

- Klasse CaesarBruteForce erstellt *(MW)*
- TestKlasse TestCaesarBruteForce erstellt *(MW)*

**20. M�rz 2012**

- Klasse CaesarEncrypt erstellt *(MW)*
- TestKlasse TestCaesarEncrypt erstellt. *(MW)*

**22. M�rz 2012** 

- Minor Bug fixed in CaesarEncrypt. *(MW)*
- Klasse CaesarPanel erstellt. *(MW)*
- CaesarBruteForce misst die Zeit welche zum knacken ben�tigt wird. *(MW)*

**23. M�rz 2012**

- CaesarEncrypt verwendet nun einen schoeneren Algorithmus. *(MW)*
- Klasse SkytaleEncrypt hinzugef�gt. *(MW)*

**25. M�rz 2012**

- Kleiner Bugfix in neuem CaesarEncrypt Algorithmus. *(MW)*

**26. M�rz 2012**

- Klasse SetSpaces hinzugef�gt. *(MW)*
- TestKlasse TestSetSpaces hinzugef�gt. *(MW)*

**28. M�rz 2012** 

- Dokumentation nach GitHub verschoben f�r besseres Tracking *(ML)*

**01. April 2012**

 - Pivotal aktualisiert *(ML)*
 
**01. April 2012**
- Dokumentation neu begonnen, da die Formatvorlagen in Word
  das Arbeiten unn�tig komplizieren
  Einige Grundlagen zum Dokumentieren:
  - Formatieren nur wenn unbedingt n�tig (math. Formeln, Fett, Kursiv, etc.)
  - das "Finish" wird in der letzten Iteration fixiert
  - jede externe Quelle direkt beim zitierten Text einf�gen
    (wird sp�ter ins richtige Quellenverzeichnis eingef�gt) *(ML)*
    
**03. April 2012**
 
- Dokumentation aktualisiert *(ML)*
 
**04. April 2012**

- FixSpacesListener hinzugef�gt. *(MW)*
- CaesarPanel fertiggestellt. *(MW)*
- CaesarEncryptListener erstellt. *(MW)*
- CaesarDecryptListener erstellt. *(MW)*

**04. April 2012**

- Dokumentation aktualisiert (Kryptoanalyse und Vig�nere) *(ML)*

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
  Uebersicht f�hren soll. *(MW)*
- Klasse TextToString erstellt. *(MW)*
 
**15. Mai 2012**

- Klasse Kryptonite erstellt (Main GUI mit JavaFX 2.1) *(MW)*
- Klasse MainTree erstellt (dient der Navigation im GUI) *(MW)*
- Klasse MainMenu erstellt *(MW)*
- Klasse InfoPanelFX erstellt *(MW)*
 
**16. Mai 2012**

- Rechtschreibkorrektur in MainTree *(MW)*
- Klasse CaesarPanelFX erstellt Design ist fertig; noch keine Funktionalit�t *(MW)*

**23. Mai 2012**

- ToggleGroup f�r RadioButtons in CaesarPanelFX erstellt *(MW)*
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
  GUI zu testen. Momentan macht aber die zuk�nftige GUI Klasse MainPanelFX sorgen. *(MW)*


**30. Mai 2012**

- Kryptonite angepasst, so das MainTreeChangeListener funktionert *(MW)*
- Kleinerer Bugfix in CaesarBruteForce *(MW)*

**09. Juni 2012**

- Enum Alphabet erstellt, in welchen die H�ufigkeitsverteilung der Buchstaben
  in deutschen Texten hinterlegt ist. *(MW)*
- Klasse FrequencyChart implementiert und Funktion �berpr�ft. *(MW)*
- Test Text File mit Plaintext hinzugef�gt. *(MW)*

**10. Juni 2012**

- CaesarPanelFX und entsprechende Eventhandler so angepasst, das nun die komplette
  Ausgabe in der GUI erfolgt. *(MW)*
- Hauptmenu kann nun die GUI schliesen. *(MW)*
- Haputmenu durch VersionListener und ExitListener die entsprechenden
  Funktionen hinzugef�gt. *(MW)*

**11. Juni 2012**

- Kryptonite angepasst um mehr funktionalit�t und felxibilit�t in die 
  GUI zu bekommen. *(MW)*
- MainTreeChangeListener und VersionListener angepasst, das Sie mit neuer
  GUI Architektur funktionieren. *(MW)*
- Gr��ere GUI Architektur �nderungen angefangen -> Verlust der Funktion im 
  Moment *(MW)*

**12. Juni 2012**

- Allgemein mehrere Klassen angepasst (vor allem EventListener & Panels) damit
  die neue GUI Architektur wieder funktioniert. *(MW)*

**13. Juni 2012**

- Caesar Cipher komplett implementiert. *(MW)*
- Rechtes Panel f�r Substitution Cipher implementiert. *(MW)*
- Ungen�tzte "alte" Klassen deleted. *(MW)*
- Klassen CharacterMapper und CharacterMapperTest erzeugt f�r die monoalphabetischen Mappings *(ML)*

**14. Juni 2012**

- Gro�es Refactoring der GUI Klassen (mit Augenmerk auf die Eventhandler) *(MW)*
- Bugfixing bei FrequencyAnalyzer, z�hlt nun die Spaces nicht mehr mit. *(MW)*
- FrequencyAnalyzer liefert nun eine f�r die Weiterverarbeitung formatierte MAP. *(MW)*

#
#Pr�sentation des Projekts 15. Juni 2012