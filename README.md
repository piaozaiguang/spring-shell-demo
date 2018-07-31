# spring-shell-demo

Run `com.github.piaozaiguang.shell.Application`

```bash
myshell:>help
AVAILABLE COMMANDS

Basic
        version: Show version

Built-In Commands
        clear: Clear the shell screen.
        exit, quit: Exit the shell.
        help: Display help about available commands.
        script: Read and execute commands from a file.
        stacktrace: Display the full stacktrace of the last error.

Input
        echo: Echo arity
        echo2: Prefixed echo
        hello: Say hello to {0}.

Special
      * run: Unavailable command

Commands marked with (*) are currently unavailable.
Type `help <command>` to learn more.
```
```bash
myshell:>help echo2


NAME
	echo2 - Prefixed echo

SYNOPSYS
	echo2 [--value] string  

OPTIONS
	--value  string
		Input a string, min = 3.
		[Mandatory]
		[个数必须在3和2147483647之间]
```
```bash
myshell:>version
1.0.0
```
```bash
myshell:>hello
Hello, world !


myshell:>hello spring
Hello, spring !


myshell:>hello --to spring
Hello, spring !
```
```bash
myshell:>echo 1 2 3
a = 1, b = 2, c = 3


myshell:>echo2 a
The following constraints were not met:
	--value string : 个数必须在3和2147483647之间 (You passed 'a')


myshell:>echo2 abc
DEMO --> abc
```
```bash
myshell:>run
Command 'run' exists but is not currently available because This is unavailable command.
Details of the error have been omitted. You can use the stacktrace command to print the full stacktrace.
```
```bash
myshell:>exit
```