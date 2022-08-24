package pack.DAO;

public interface DaoUser {

	public int userExist(String Uname , String passwd) ;
	public void CreateUser(String firstName, String lastName , String userName , String password);
	
}
