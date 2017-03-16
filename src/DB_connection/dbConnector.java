/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_connection;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author tmatheesha
 */
public class dbConnector {
    
    
    public void Connect(){
            try{
                Class.forName("java.sql.Driver");
                Connection conn= (Connection)DriverManager.getConnection("jdbc:mysql://loaclhost:3306/db_puksipos","root","Livelongkodde19%");
                
                Statement st = (Statement) conn.createStatement();
                String query ="Select * from add_bill";
                try (ResultSet rs = st.executeQuery(query)) {
                    while(rs.next()){
                        String bill_ref_id =rs.getString("bill_ref_id");
                        String bill_item_ref_id =rs.getString("bill_item_ref_id");
                        String bill_item_code =rs.getString("bill_item_code");
                        String bill_discount =rs.getString("bill_discount");
                        String bill_payment_cash =rs.getString("bill_payement_cash");
                        String bill_payment_credit_card =rs.getString("bill_payment_credit_card");
                        String bill_payment_cheque =rs.getString("bill_payment_cheque");
                        String bill_date_time =rs.getString("bill_date_time");
                        String bill_user =rs.getString("bill_user");
                        String bill_counter_no =rs.getString("bill_counter_no");
                        String bill_returned_check =rs.getString("bill_returned_check");
                        String bill_discount_id =rs.getString("bill_discount_id");
                        String bill_return_id =rs.getString("bill_return_id");
                        String bill_sub_total =rs.getString("bill_sub_total");
                        String bil_session_id =rs.getString("bill_session_id");
                    }
                }
            }
            catch(ClassNotFoundException | SQLException e){
                
            }
    
    }
    
}
