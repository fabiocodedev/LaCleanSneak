package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.security.crypto.bcrypt.BCrypt;

import bean.User;
import connector.Connect;

public class UserDao implements IDAO<User> {

	Connection connect = Connect.getConnect();
	PreparedStatement sql = null; 
	ResultSet rs = null;
	
	public boolean create(User user) {
		try {
			
			//VERSION AVEC PASSWORD() -----------------------------------------------
//			sql = coBDD.prepareStatement("INSERT INTO user (firstName,lastName,address,phone,mail,password,userPicPath) "
//					+ "VALUES (?,?,?,?,?,PASSWORD(?),?)");
//			
//			sql.setString(1, user.getFirstName());
//			sql.setString(2, user.getLastName());
//			sql.setString(3, user.getAddress());
//			sql.setString(4, user.getPhone());
//			sql.setString(5, user.getMail());
//			sql.setString(6, user.getPassword());
//			sql.setString(7, user.getUserPicPath());

			
			
			//VERSION AVEC BCRYPT -----------------------------------------------
			
			sql = connect.prepareStatement("INSERT INTO user (firstName,lastName,address,phone,mail,password,userPicPath) "
					+ " VALUES (?,?,?,?,?,?,?)");
			
			sql.setString(1, user.getFirstName());
			sql.setString(2, user.getLastName());
			sql.setString(3, user.getAddress());
			sql.setString(4, user.getPhone());
			sql.setString(5, user.getMail());
			sql.setString(6, user.getPassword());
			sql.setString(7, user.getUserPicPath());
			
			sql.execute();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	

	@Override
	public ArrayList<User> read() {
		
		ArrayList<User> usersList = new ArrayList<>();
		
		try {
			sql = connect.prepareStatement("SELECT * FROM user");
			rs = sql.executeQuery();
			
			while(rs.next()) {
				User user = new User(rs.getInt("id"),rs.getString("firstName"),rs.getString("lastName"),rs.getString("address"),
							rs.getString("phone"),rs.getString("mail"),rs.getString("password")
							,rs.getString("userPicPath"));
				
				usersList.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usersList;
	}

	@Override
	public boolean update(User user) {
		
		try {
			sql = connect.prepareStatement("UPDATE user SET firstName=?, lastName=?, address=?, phone=?,"
					+ " mail=?, password=?, userPicPath=?, WHERE id=?");
			
			sql.setString(1, user.getFirstName());
			sql.setString(2, user.getLastName());
			sql.setString(3, user.getAddress());
			sql.setString(4, user.getPhone());
			sql.setString(5, user.getMail());
			sql.setString(6, user.getPassword());
			sql.setString(7, user.getUserPicPath());
			sql.setInt(8, user.getId());
			
			sql.execute();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean delete(User user) {
		
		try {
			sql = connect.prepareStatement("DELETE * FROM user WHERE id=?");
			
			sql.setInt(1, user.getId());
			
			sql.execute();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public User findById(int id) {
		
		User user = new User();
		
		try {
			sql = connect.prepareStatement("SELECT * FROM user WHERE id=?");
			
			sql.setInt(1, user.getId());
			
			rs = sql.executeQuery();
			
			while(rs.next()) {
				user = new User(rs.getInt("id"),rs.getString("firstName"),rs.getString("lastName"),rs.getString("address"),
							rs.getString("phone"),rs.getString("mail"),rs.getString("password"),rs.getString("userPicPath"));
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
		
	} 
	
	public User login(String mail, String password) {
		try {
//           Version avec PASSWORD de MYSQL -------------------------------- 
//           sql = connect.prepareStatement("select * from user where mail=? and password = PASSWORD(?)");
//			 sql.setString(1, email);
//	         sql.setString(2, mdp);
			
//			VERSION AVEC BCRYPT ---------------------------------------------
			sql = connect.prepareStatement("select * from user where mail=?");
			sql.setString(1, mail);
			
			rs = sql.executeQuery();
			
			if (rs.next()) {
				if(BCrypt.checkpw(password, rs.getString("password"))) {
					//AVEC MOT DE PASSE
					//return new User(rs.getString("firstName"), rs.getString("lastName"),rs.getString("mail"), rs.getString("password"));
					return new User( rs.getString("firstName"),rs.getString("lastName"),rs.getString("mail"));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
