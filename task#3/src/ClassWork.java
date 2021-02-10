import java.io.*;

public class ClassWork {
/*
InputStream:
    int available()
    close()
    int read(byte[] b, int offset, int length)
    long skip(long num ) количество пропускаемых байтов

OutputStream:
    void flush()
    int write(int a ) записывает 1 байт
    void write(byte[] b, int offset, int length)

FileInputStream(string path):
FileOutputStream(strin path, boolean append)
try(FileInputStream fis=new...)
{
...
}
после блока try файл закроется

FileReader(string path)
readLine() -строчка
read() -символ

FileWriter
writer
writeline

RandomAccessFile(String path, string mode) r/rw
void seek(long pos);
long getFilePointer();
void skipBytes(int n);
long length();

int read()
int read(bytes []b)
readString()
readUTF()

 */
/*
дан файл создать его копию с пмоощью чтения поэлемненто ,а вторая задача построчно
распчечатать самые кортокие строки из файла
найти сумму чисел текстового файла
распечтать строки файла в обратном порядке
подсчиатать количество пустых строк

 */
    public static void main(String[] args) {

    }
}
