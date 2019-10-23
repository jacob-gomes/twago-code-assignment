REM creating new folder for class files
md build

REM Compiling the code
javac -d ./build -sourcepath ./src/main ./src/main/com/twago/assignment/findmax/Main.java

REM Running the code
java -cp .;build;**/*.class com.twago.assignment.findmax.Main