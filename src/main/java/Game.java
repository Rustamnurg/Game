import java.io.*;
import java.net.Socket;

/**
 * Created by Rustam on 16.12.16.
 */
public class Game {
    public void game(){
        int port = 3457;
        String host = "localhost";
        try {
            Socket socket = new Socket(host, port);


            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();

            // Конвертируем потоки в другой тип, чтоб легче обрабатывать текстовые сообщения.
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);

            // Создаем поток для чтения с клавиатуры.
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            System.out.println();


                line = "go"; // ждем пока пользователь введет что-то и нажмет кнопку Enter.
                out.writeUTF(line); // отсылаем введенную строку текста серверу.
                out.flush(); // заставляем поток закончить передачу данных.
                line = in.readUTF(); // ждем пока сервер отошлет строку текста.
                System.out.println(line);

        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
