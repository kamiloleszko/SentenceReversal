@echo off
cls
:start
javac Main.java

@echo Welcome in "Reverse your sentence" application
java Main

@echo Thank you for using my application.

set choice=
set /p choice="Please press "Y" if you want to use this application once again. If not please press any other button: "
if not '%choice%'=='' set choice=%choice:~0,1%
if '%choice%'=='Y' goto start
if '%choice%'=='y' goto start
@echo Please press any button to close the program.
@echo Thank you for using my application
@echo projected by Kamil Gerard Oleszko
pause>nul