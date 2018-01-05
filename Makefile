.PHONY: all clean

all:
	scala *.scala

clean:
	-rm -rf *.class
