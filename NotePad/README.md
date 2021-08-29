# NotePad

A notepad desktop appliction created using java programming language and Swing(java GUI)

For frame - JFrame,JLabel,JScrollPane,JTextArea,JmenuItem,JMenuBar,JMenu used

Functions implemented:

FILE
1. new - Opens a new file with confirmation to save the existing file with heading "Untitled - Notepad".
2. open - Open an existing file by using JFileChooser object.
3. save - Save the existing file
4. saveas - save the existing file newly as another file.

EDIT
1. cut - cut the selected text
2. copy - copy the selected text
3. paste - paste the selected text
4. find and replace - find or find and replace the selected text with new one
5. print -  print the textarea content or save as file in computer or laptop

FORMAT
1. font - Font class used to set fontfamily, fontstyle and fontsize
2. font_color - change the font color using Color class
3.background_color - change the background color of textarea using Color class

VIEW 
1. zoomin - decrease the font size
2. zoomout -increase the font size


When you build an Java application project that has a main class, the IDE
automatically copies all of the JAR
files on the projects classpath to your projects dist/lib folder. The IDE
also adds each of the JAR files to the Class-Path element in the application
JAR files manifest file (MANIFEST.MF).

To run the project from the command line, download this editor.jar file and run this command from the command line
**java -jar "Editor.jar" **
