package com.training.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.training.ifaces.DataAccess;
import com.training.model.BloodDonor;
import com.training.utils.DBConnectionUtils;

public class DonorDaoImpl implements DataAccess<BloodDonor> {

	private Connection con;

	public DonorDaoImpl(Connection con) {
		super();
		this.con = con;
	}

	public DonorDaoImpl() {
		super();
		con = DBConnectionUtils.getMySqlConnection();
	}

	
	@Override
	public int add(BloodDonor t) {
		String sql = "insert into lumen_donors values(?,?,?,?,?,?,?)";
		int rowsAdded = 0;
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, t.getName());
			pstmt.setInt(2, t.getAge());
			pstmt.setString(3, t.getBloodGroup());
			pstmt.setString(4, t.getGender());
			pstmt.setLong(5, t.getPhone());
			String email = t.getEmail();
			pstmt.setObject(6, email);
			pstmt.setDate(7, Date.valueOf(t.getDob()));

			rowsAdded = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowsAdded;
	}

	@Override
	public List<BloodDonor> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from  lumen_donors";
		List<BloodDonor> donorlist = new ArrayList<BloodDonor>();
		try (PreparedStatement pstmt = con.prepareStatement(sql)) {

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString(1);
				int age = rs.getInt(2);
				String bloodGroup = rs.getString(3);
				String gender = rs.getString(4);
				long phone = rs.getLong(5);
				String email = rs.getString(6);
				LocalDate dob = rs.getDate(7).toLocalDate();

				BloodDonor donor = new BloodDonor(name, age, bloodGroup, gender, phone, email, dob);

				donorlist.add(donor);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return donorlist;

	}

}
