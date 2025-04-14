package com.example.elaborazionecsv;
import java.io.*;
import java.util.Random;

public class Main
{
    public static void main (String[]args)
    {
        html();
    }
    public void MioCampo(BufferedWriter bw, BufferedReader br, String next)
    {

    }
    public void ContaCampi (BufferedReader br, String next)
    {

    }
    public void AggiuntaRecord (BufferedWriter bw, BufferedReader br, String next)
    {

    }
    public static void html()
    {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\pesenti.21136\\Desktop\\Pesenti.csv"));
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\pesenti.21136\\Desktop\\index.html")))
        {
            pw.print("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <title>Document</title>\n" +
                    "</head>\n" +
                    "<body>\n"+
                    "<table>\n");
            String line=br.readLine();
            String[] valori=line.split(";");
            pw.print("<tr>\n" +
                    "    <th>"+valori[0]+"</th>\n" +
                    "    <th>"+valori[1]+"</th>\n" +
                    "    <th>"+valori[2]+"</th>\n" +
                    "  </tr>\n");
            while((line=br.readLine())!=null)
            {
                valori=line.split(";");
                pw.print("<tr>\n" +
                        "    <td>"+valori[0]+"</td>\n" +
                        "    <td>"+valori[1]+"</td>\n" +
                        "    <td>"+valori[2]+"</td>\n" +
                        "    <td>"+valori[3]+"</td>\n" +
                        "    <td>"+valori[4]+"</td>\n" +
                        "    <td>"+valori[5]+"</td>\n" +
                        "    <td>"+valori[6]+"</td>\n" +
                        "    <td>"+valori[7]+"</td>\n" +
                        "    <td>"+valori[8]+"</td>\n" +
                        "    <td>"+valori[9]+"</td>\n" +
                        "    <td>"+valori[10]+"</td>\n" +
                        "    <td>"+valori[11]+"</td>\n" +
                        "    <td>"+valori[12]+"</td>\n" +
                        "    <td>"+valori[13]+"</td>\n" +
                        "    <td>"+valori[14]+"</td>\n" +
                        "  </tr>\n");
            }
            pw.print("</table>\n</body>\n</html>");
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}