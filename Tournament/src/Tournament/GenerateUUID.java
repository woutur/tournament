package Tournament;
import java.util.UUID;


public class GenerateUUID {
		
	public String generateID() {
		UUID uuid = UUID.randomUUID();
		String randomUUIDString = uuid.toString();
		return randomUUIDString;
		}
}
	
