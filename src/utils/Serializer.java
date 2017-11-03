package utils;

//an interface summarizes a general purpose serialiser
public interface Serializer {
	  void push(Object o);
	  Object pop();
	  void write() throws Exception;
	  void read() throws Exception;
}
