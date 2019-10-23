## creating new folder for class files
mkdir build

## Compiling the code
javac -d ./build -sourcepath ./src/main ./src/main/com/twago/assignment/findmax/Main.java

## Running the code
java -cp .:build:**/*.class com.twago.assignment.findmax.Main