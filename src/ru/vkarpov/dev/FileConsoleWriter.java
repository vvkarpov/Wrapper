package ru.vkarpov.dev;

import java.io.*;

/*
Wrapper FileWriter
*/

public class FileConsoleWriter{

    private FileWriter fileWriter;

    //Constructors
    public FileConsoleWriter(String file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }
    public FileConsoleWriter(String file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }
    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }
    public FileConsoleWriter(File file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }
    public FileConsoleWriter(FileDescriptor id) throws IOException {
        this.fileWriter = new FileWriter(id);
    }

    //Methods
    public void write(char[] cbuf, int off, int len) throws IOException{
        fileWriter.write(cbuf, off, len);
        for (int i = off; i < off+len; i++){
            System.out.print(cbuf[i]);
        }
    }

    public void write(int c) throws IOException{
        fileWriter.write(c);
        System.out.print(c);
    }

    public void write(String str) throws IOException{
        fileWriter.write(str);
        System.out.print(str);
    }

    public void write(String str, int off, int len) throws IOException{
        fileWriter.write(str, off, len);
        for (int i = off; i < off + len; i++) {
            System.out.print(str.charAt(i));
        }
    }

    public void write(char[] cbuf) throws IOException{
        fileWriter.write(cbuf);
        for (int i = 0; i < cbuf.length; i++) {
            System.out.print(cbuf[i]);
        }
    }

    public void close() throws IOException{
        fileWriter.close();
    }

    public static void main(String[] args) {
    }

}