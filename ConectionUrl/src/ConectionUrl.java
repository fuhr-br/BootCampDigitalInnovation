import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

public class ConectionUrl {

	public static void main(String[] args) throws IOException {
		System.out.println("Digite a url: ");
		
		String url;
		url= new Scanner(System.in).nextLine();
		getUrl(url);	
		
	}

	public static void getUrl(String nameUrl) throws IOException {
		var url = new URL(nameUrl);
		var urlconecction = url.openConnection();
		var bufferReader = new BufferedReader(new InputStreamReader(urlconecction.getInputStream()));
		System.out.println(bufferReader.lines().collect(Collectors.joining()).replace(">", "\n"));
	}
}
