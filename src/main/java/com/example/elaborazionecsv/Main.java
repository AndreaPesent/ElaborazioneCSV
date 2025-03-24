package com.example.elaborazionecsv;
import java.io.*;
import java.util.Random;

public class Main
{
    public static void main (String[]args) throws IOException
    {
        FileReader fr = new FileReader("C:\\Users\\pesenti.21136\\Desktop\\Pesenti.csv");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\pesenti.21136\\Desktop\\Pesenti.csv"));
        String next;
    }
    public void MioCampo(BufferedWriter bw, BufferedReader br, String next)
    {
        try
        {
            next="*";
            do
            {
                Random a = new Random();
                br.readLine();
                bw.write(";MioValore");

            } while (next!=null);
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
    public void ContaCampi (BufferedReader br, String next)
    {
        int cont=0;
        try
        {
            do
            {
                br.readLine();
                if(next==";")
                {
                    cont++;
                }
                br.close();
            } while (next!=null);
            System.out.println("numero di campi: " + cont);
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
    public void AggiuntaRecord (BufferedWriter bw, BufferedReader br, String next)
    {
        try
        {
            next="*";
            do
            {
                br.readLine();
                bw.write(";false");

            } while (next!=null);
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}