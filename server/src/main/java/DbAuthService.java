import java.util.HashMap;

public class DbAuthService implements AuthService{

        HashMap<String, String> users = new HashMap<>();

        public DbAuthService(){
            users.put("Anton", "123321");
            users.put("Mark", "123");
            users.put("Ivan", "1234");
        }



        @Override
        public String getNicknameByLoginAndPassword(String login, String password) {

            if(users.containsKey(login)&&users.get(login).equals(password)) {
                System.out.println("return "+login);
                return login;
            }
            return null;

        }
    }

