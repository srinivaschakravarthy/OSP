
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame {
   
public static boolean isNumeric(String str)  
{  
  try  
  {  
    double d = Double.parseDouble(str);  
  }  
  catch(NumberFormatException nfe)  
  {  
    return false;  
  }  
  return true;  
} 
public String userid;
DefaultTableModel model,model2,model3,model4; 
public String puploaderid="";
public String cstcity="kgp";

    
    public NewJFrame() {
        initComponents();
        jTabbedPane1.setVisible(false); 
          jTabbedPane4.setVisible(false); 
          ShowingPanel1.setVisible(false);
        customerRegister.setVisible(false);
        managerRegister.setVisible(false);
        managerFunctions.setVisible(false);
        customerFunctions.setVisible(false);
        index.setVisible(true);
        
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagechooser = new javax.swing.JFileChooser();
        index = new javax.swing.JPanel();
        Password_label = new javax.swing.JLabel();
        UserId_label = new javax.swing.JLabel();
        inputuserid = new javax.swing.JTextField();
        CusLoginb = new javax.swing.JButton();
        custRegisterb = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        managerloginb = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cpass = new javax.swing.JPasswordField();
        mpass = new javax.swing.JPasswordField();
        customerFunctions = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        searchitem = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        sbox = new javax.swing.JComboBox();
        jScrollPane6 = new javax.swing.JScrollPane();
        itemtable = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        negotable = new javax.swing.JTable();
        nefield = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        deliverybox = new javax.swing.JTextArea();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        sellertable = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        sellernegotable = new javax.swing.JTable();
        revpricefield = new javax.swing.JTextField();
        revpriceb = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        pcity = new javax.swing.JTextField();
        pprice = new javax.swing.JTextField();
        pcompany = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        page = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        heavybox = new javax.swing.JComboBox();
        jLabel74 = new javax.swing.JLabel();
        categorybox = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        pdescription = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        cnamelabel = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        cnamef = new javax.swing.JTextField();
        ccityf = new javax.swing.JTextField();
        cemailf = new javax.swing.JTextField();
        cphnof = new javax.swing.JTextField();
        cimidf = new javax.swing.JTextField();
        cchangeb = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        copf = new javax.swing.JPasswordField();
        cnpf = new javax.swing.JPasswordField();
        ccnpf = new javax.swing.JPasswordField();
        cchangepassword = new javax.swing.JButton();
        cLogOut = new javax.swing.JButton();
        cWelcome = new javax.swing.JLabel();
        managerFunctions = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        searchingbox = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        customerItemsSarchb = new javax.swing.JButton();
        managerbox = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        REvqulaitymanagerb = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        auditTable = new javax.swing.JTable();
        datebox = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        viewauditb = new javax.swing.JButton();
        numberperformed = new javax.swing.JLabel();
        totalmoney = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        addcategoryb = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        mopf = new javax.swing.JPasswordField();
        mnpf = new javax.swing.JPasswordField();
        mcnpf = new javax.swing.JPasswordField();
        mchangepassword = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Negodisplaytable = new javax.swing.JTable();
        jLabel37 = new javax.swing.JLabel();
        viewsellerb = new javax.swing.JButton();
        negocb = new javax.swing.JButton();
        mLogOut = new javax.swing.JButton();
        mWelcome = new javax.swing.JLabel();
        customerRegister = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        cityfield = new javax.swing.JTextField();
        phonefield = new javax.swing.JTextField();
        emailfield = new javax.swing.JTextField();
        imidfield = new javax.swing.JTextField();
        createb = new javax.swing.JButton();
        passwordfield = new javax.swing.JPasswordField();
        passwordfield2 = new javax.swing.JPasswordField();
        managerRegister = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        managerCreateb = new javax.swing.JButton();
        mname = new javax.swing.JTextField();
        mphone = new javax.swing.JTextField();
        memail = new javax.swing.JTextField();
        mimid = new javax.swing.JTextField();
        mbioid = new javax.swing.JTextField();
        mdob = new javax.swing.JTextField();
        maddress = new javax.swing.JTextField();
        mgender = new javax.swing.JComboBox();
        mpasswd1 = new javax.swing.JPasswordField();
        mpasswd2 = new javax.swing.JPasswordField();
        ShowingPanel1 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        sname1 = new javax.swing.JTextField();
        sprice1 = new javax.swing.JTextField();
        scompany1 = new javax.swing.JTextField();
        scity1 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        sdescription1 = new javax.swing.JTextArea();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        sid1 = new javax.swing.JTextField();
        negofield1 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        heavyfield = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        AddressArea = new javax.swing.JTextArea();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        catfield = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        changebox = new javax.swing.JComboBox();
        catagorychangeb = new javax.swing.JButton();
        removeitemb = new javax.swing.JButton();
        imagelabel1 = new javax.swing.JLabel();
        backb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        Password_label.setText("Password");

        UserId_label.setText("User Id");

        inputuserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputuseridActionPerformed(evt);
            }
        });

        CusLoginb.setText("Login");
        CusLoginb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CusLoginbActionPerformed(evt);
            }
        });

        custRegisterb.setText("Register");
        custRegisterb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custRegisterbActionPerformed(evt);
            }
        });

        jLabel8.setText("Manager Id");

        jLabel9.setText("Password");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        managerloginb.setText("Login");
        managerloginb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerloginbActionPerformed(evt);
            }
        });

        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout indexLayout = new javax.swing.GroupLayout(index);
        index.setLayout(indexLayout);
        indexLayout.setHorizontalGroup(
            indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, indexLayout.createSequentialGroup()
                .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(indexLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(CusLoginb)
                        .addGap(37, 37, 37)
                        .addComponent(custRegisterb))
                    .addGroup(indexLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserId_label)
                            .addComponent(Password_label))
                        .addGap(41, 41, 41)
                        .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputuserid, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(cpass))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(managerloginb))
                .addGap(38, 38, 38)
                .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(mpass))
                .addGap(46, 46, 46))
        );
        indexLayout.setVerticalGroup(
            indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(indexLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserId_label)
                    .addComponent(inputuserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Password_label)
                    .addComponent(cpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(indexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CusLoginb)
                    .addComponent(custRegisterb)
                    .addComponent(managerloginb)
                    .addComponent(jButton2))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(200, 200));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(2000, 3000));

        jPanel7.setBackground(new java.awt.Color(153, 255, 255));
        jPanel7.setForeground(new java.awt.Color(153, 255, 255));

        jLabel41.setText("Enter key characters");

        jLabel42.setText("Select a category");

        sbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sboxActionPerformed(evt);
            }
        });

        itemtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Item Id", "Item Name", "Price", "Age", "Availability", "City", "Company "
            }
        ));
        jScrollPane6.setViewportView(itemtable);

        jButton11.setText("View Details");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Search");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("OR");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton11))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel41))
                                .addGap(18, 18, 18)
                                .addComponent(searchitem, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel38))
                            .addComponent(jButton12))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel42)
                        .addGap(18, 18, 18)
                        .addComponent(sbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(searchitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(sbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(36, 36, 36)
                .addComponent(jButton12)
                .addGap(77, 77, 77)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Search items", jPanel7);

        jPanel8.setBackground(new java.awt.Color(153, 255, 255));

        negotable.setBackground(new java.awt.Color(153, 255, 255));
        negotable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item id", "Item name", "Price", "Negotiated price", "Revised price"
            }
        ));
        jScrollPane9.setViewportView(negotable);

        jButton17.setText("Negotiate");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("Buy");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        deliverybox.setColumns(20);
        deliverybox.setRows(5);
        jScrollPane10.setViewportView(deliverybox);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(nefield, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton17))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(1355, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(nefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton17)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2559, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("View cart", jPanel8);

        jTabbedPane1.addTab("Buy", jTabbedPane3);

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));

        sellertable.setBackground(new java.awt.Color(153, 255, 255));
        sellertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item Id", "Name", "Company", "Price", "Status"
            }
        ));
        jScrollPane11.setViewportView(sellertable);

        sellernegotable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item id", "Item name", "Original price", "negotiated price", "revised price", "negotiater id"
            }
        ));
        jScrollPane12.setViewportView(sellernegotable);

        revpriceb.setText("Revise Price");
        revpriceb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revpricebActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText("Uploaded Items");

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("Negotiating items");

        jButton1.setText("Remove item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(revpricefield, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(revpriceb))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel39))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel43)))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jLabel43)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(revpricefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(revpriceb))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("View my items", jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));

        jLabel68.setText("Name");

        jLabel69.setText("City");

        jLabel70.setText("Price");

        jLabel71.setText("Manufacturing company");

        jLabel72.setText("age(days)");

        jLabel73.setText("item heavy");

        heavybox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "no", "yes" }));

        jLabel74.setText("Category");

        jButton3.setText("upload");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel75.setText("Description");

        pdescription.setColumns(20);
        pdescription.setRows(5);
        jScrollPane13.setViewportView(pdescription);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel74)
                                .addGap(18, 18, 18)
                                .addComponent(categorybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel69)
                                    .addComponent(jLabel68)
                                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pname)
                                    .addComponent(pcity)
                                    .addComponent(page, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel70)
                                    .addComponent(jLabel71)
                                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(heavybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pprice)
                                        .addComponent(pcompany, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel75)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jButton3)))
                .addContainerGap(1421, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70)
                    .addComponent(pprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(pcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71)
                    .addComponent(pcompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73)
                    .addComponent(heavybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(categorybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel75))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Upload item", jPanel5);

        jTabbedPane1.addTab("Sell", jTabbedPane2);

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 100));

        cnamelabel.setText("Name:");

        jLabel51.setText("City:");

        jLabel52.setText("Email-Id:");

        jLabel53.setText("IM-Id:");

        jLabel54.setText("Phone No.:");

        cchangeb.setText("Change");
        cchangeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cchangebActionPerformed(evt);
            }
        });

        jLabel55.setText("Old Password:");

        jLabel56.setText("New Password:");

        jLabel57.setText("Confirm New Password:");

        copf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copfActionPerformed(evt);
            }
        });

        cchangepassword.setText("Change Password");
        cchangepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cchangepasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cnamelabel)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52)
                    .addComponent(jLabel54)
                    .addComponent(jLabel53))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cchangeb)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cemailf, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(cphnof)
                            .addComponent(cimidf)
                            .addComponent(ccityf)
                            .addComponent(cnamef))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel57)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ccnpf, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel55)
                                            .addComponent(jLabel56))
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(copf, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                            .addComponent(cnpf)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cchangepassword)
                                .addGap(54, 54, 54)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cnamelabel)
                            .addComponent(cnamef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55)
                            .addComponent(copf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(ccityf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56)
                            .addComponent(cnpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(cemailf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57)
                            .addComponent(ccnpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(cphnof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel53))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(cimidf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(cchangepassword)))
                .addGap(64, 64, 64)
                .addComponent(cchangeb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Edit profile", jPanel3);

        cLogOut.setText("Log Out");
        cLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cLogOutActionPerformed(evt);
            }
        });

        cWelcome.setText("jLabel38");

        javax.swing.GroupLayout customerFunctionsLayout = new javax.swing.GroupLayout(customerFunctions);
        customerFunctions.setLayout(customerFunctionsLayout);
        customerFunctionsLayout.setHorizontalGroup(
            customerFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customerFunctionsLayout.createSequentialGroup()
                .addContainerGap(684, Short.MAX_VALUE)
                .addComponent(cWelcome)
                .addGap(39, 39, 39)
                .addComponent(cLogOut)
                .addGap(86, 86, 86))
            .addGroup(customerFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(customerFunctionsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        customerFunctionsLayout.setVerticalGroup(
            customerFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerFunctionsLayout.createSequentialGroup()
                .addGroup(customerFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cLogOut)
                    .addComponent(cWelcome))
                .addGap(0, 599, Short.MAX_VALUE))
            .addGroup(customerFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(customerFunctionsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "User ID", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton10.setText("Remove User");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jButton10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton10)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Mange Users", jPanel6);

        jLabel20.setText("Enter Name:");

        jLabel21.setText("Select Category:");

        customerItemsSarchb.setText("Search");
        customerItemsSarchb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerItemsSarchbActionPerformed(evt);
            }
        });

        managerbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerboxActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "name", "price", "age", "Availability", "City", "Company"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        REvqulaitymanagerb.setText("Edit Item and Review Quality");
        REvqulaitymanagerb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REvqulaitymanagerbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchingbox, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(managerbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(customerItemsSarchb))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(REvqulaitymanagerb, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(searchingbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(customerItemsSarchb)
                    .addComponent(managerbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(REvqulaitymanagerb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("View Items", jPanel9);

        auditTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Item id", "Name", "Category", "Seller id", "buyer id", "selling price", "comapny"
            }
        ));
        jScrollPane4.setViewportView(auditTable);

        datebox.setText("dd/mm/year");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("Enter a date to view the transactions:");

        viewauditb.setText("View");
        viewauditb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewauditbActionPerformed(evt);
            }
        });

        numberperformed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numberperformed.setText("jLabel37");

        totalmoney.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalmoney.setText("jLabel38");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(datebox, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(viewauditb))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numberperformed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totalmoney)
                .addGap(155, 155, 155))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel36)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewauditb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberperformed)
                    .addComponent(totalmoney))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jTabbedPane4.addTab("Perform Audit", jPanel10);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name of Category"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Add New Category:");

        jLabel23.setText("Name:");

        addcategoryb.setText("Add");
        addcategoryb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcategorybActionPerformed(evt);
            }
        });

        jButton8.setText("Remove Category");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(addcategoryb))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(32, 32, 32)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addcategoryb)))
                .addGap(26, 26, 26)
                .addComponent(jButton8)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Manage Category", jPanel11);

        jLabel24.setText("Name:");

        jLabel25.setText("Gender:");

        jLabel26.setText("Date of Birth:");

        jLabel27.setText("Biometric ID:");

        jLabel28.setText("Address:");

        jLabel29.setText("Telephone No.:");

        jLabel30.setText("Email-ID:");

        jLabel31.setText("IM-ID:");

        jButton9.setText("Change");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel58.setText("Old Password:");

        jLabel59.setText("New Password:");

        jLabel60.setText("Confirm New Password:");

        mcnpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcnpfActionPerformed(evt);
            }
        });

        mchangepassword.setText("Change Password");
        mchangepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mchangepasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel58)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(mopf, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel60)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(mcnpf, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel59)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addComponent(mnpf, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 348, Short.MAX_VALUE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mchangepassword)
                                .addGap(76, 76, 76))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jButton9)))
                .addGap(32, 32, 32))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58)
                            .addComponent(mopf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel59)
                                    .addComponent(mnpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel60)
                            .addComponent(mcnpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(mchangepassword)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(30, 30, 30))
        );

        jTabbedPane4.addTab("Edit Profile", jPanel13);

        Negodisplaytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Item Id", "Item name", "Seller's Id", "Negotiater's Id", "Original Price", "Negotiated price", "Revised price"
            }
        ));
        jScrollPane5.setViewportView(Negodisplaytable);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("Negotiation Activities:");

        viewsellerb.setText("View Contact details of seller");
        viewsellerb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewsellerbActionPerformed(evt);
            }
        });

        negocb.setText("View contact details of Negotiater");
        negocb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negocbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(viewsellerb, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(negocb, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel37)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewsellerb, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(negocb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane4.addTab("Help Negotiations", jPanel12);

        mLogOut.setText("Log Out");
        mLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLogOutActionPerformed(evt);
            }
        });

        mWelcome.setText("jLabel38");

        javax.swing.GroupLayout managerFunctionsLayout = new javax.swing.GroupLayout(managerFunctions);
        managerFunctions.setLayout(managerFunctionsLayout);
        managerFunctionsLayout.setHorizontalGroup(
            managerFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managerFunctionsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mWelcome)
                .addGap(18, 18, 18)
                .addComponent(mLogOut)
                .addGap(46, 46, 46))
            .addComponent(jTabbedPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        managerFunctionsLayout.setVerticalGroup(
            managerFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managerFunctionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(managerFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mLogOut)
                    .addComponent(mWelcome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );

        customerRegister.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setText("Name");

        jLabel2.setText("City");

        jLabel3.setText("Phone");

        jLabel4.setText("Email");

        jLabel5.setText("IM-ID");

        jLabel6.setText("Password");

        jLabel7.setText("Confirm password");

        imidfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imidfieldActionPerformed(evt);
            }
        });

        createb.setText("Register");
        createb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbActionPerformed(evt);
            }
        });

        passwordfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordfield2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customerRegisterLayout = new javax.swing.GroupLayout(customerRegister);
        customerRegister.setLayout(customerRegisterLayout);
        customerRegisterLayout.setHorizontalGroup(
            customerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerRegisterLayout.createSequentialGroup()
                .addGroup(customerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerRegisterLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(customerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(22, 22, 22)
                        .addGroup(customerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namefield)
                            .addComponent(cityfield)
                            .addComponent(phonefield)
                            .addComponent(passwordfield)
                            .addComponent(passwordfield2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                        .addGap(78, 78, 78)
                        .addGroup(customerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(customerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(imidfield, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(customerRegisterLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(createb)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        customerRegisterLayout.setVerticalGroup(
            customerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerRegisterLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(customerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cityfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(imidfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(phonefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(customerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(passwordfield2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(createb)
                .addGap(40, 40, 40))
        );

        jLabel10.setText("Name");

        jLabel11.setText("Gender");

        jLabel12.setText("Address");

        jLabel13.setText("Email");

        jLabel14.setText("Phone");

        jLabel15.setText("Imid");

        jLabel16.setText("Biometric Id");

        jLabel17.setText("Date of birth:");

        jLabel18.setText("Password");

        jLabel19.setText("RePassword");

        managerCreateb.setText("Create Account");
        managerCreateb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerCreatebActionPerformed(evt);
            }
        });

        mdob.setText("dd/mm/year");

        maddress.setText("house name, city");

        mgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "male", "female" }));
        mgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout managerRegisterLayout = new javax.swing.GroupLayout(managerRegister);
        managerRegister.setLayout(managerRegisterLayout);
        managerRegisterLayout.setHorizontalGroup(
            managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managerRegisterLayout.createSequentialGroup()
                .addGroup(managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managerRegisterLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(managerRegisterLayout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(managerRegisterLayout.createSequentialGroup()
                                    .addGroup(managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel15))
                                    .addGap(18, 18, 18)
                                    .addGroup(managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(memail)
                                        .addComponent(mimid))))
                            .addGroup(managerRegisterLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(2, 2, 2)
                                .addComponent(mdob, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56)
                        .addGroup(managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(managerRegisterLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mbioid))
                            .addGroup(managerRegisterLayout.createSequentialGroup()
                                .addGroup(managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel11))
                                .addGroup(managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(managerRegisterLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(mphone, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(managerRegisterLayout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(mgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(managerRegisterLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(managerCreateb))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managerRegisterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(managerRegisterLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(maddress, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, managerRegisterLayout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mpasswd2))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, managerRegisterLayout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(18, 18, 18)
                                    .addComponent(mpasswd1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        managerRegisterLayout.setVerticalGroup(
            managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managerRegisterLayout.createSequentialGroup()
                .addGroup(managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(managerRegisterLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14)
                            .addComponent(mphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, managerRegisterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(memail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(mimid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mbioid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(mdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(maddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(mpasswd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(managerRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mpasswd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(managerCreateb)
                .addGap(36, 36, 36))
        );

        ShowingPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel61.setText("Name:");

        jLabel62.setText("Price");

        jLabel63.setText("Name of company");

        jLabel64.setText("City");

        jLabel65.setText("Description");

        sname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sname1ActionPerformed(evt);
            }
        });

        sprice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sprice1ActionPerformed(evt);
            }
        });

        scompany1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scompany1ActionPerformed(evt);
            }
        });

        scity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scity1ActionPerformed(evt);
            }
        });

        sdescription1.setColumns(20);
        sdescription1.setRows(5);
        jScrollPane7.setViewportView(sdescription1);

        jButton15.setText("Buy");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Negotiate");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel66.setText("Item Id");

        sid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sid1ActionPerformed(evt);
            }
        });

        jLabel67.setText("Heavyness");

        AddressArea.setColumns(20);
        AddressArea.setRows(5);
        jScrollPane8.setViewportView(AddressArea);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Negotiate seller for price");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Enter address to buy the item");

        jLabel34.setText("Category");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("Change Category of item");

        changebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeboxActionPerformed(evt);
            }
        });

        catagorychangeb.setText("Change");
        catagorychangeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catagorychangebActionPerformed(evt);
            }
        });

        removeitemb.setText("Remove item");
        removeitemb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeitembActionPerformed(evt);
            }
        });

        imagelabel1.setText("Imagelabel");

        backb.setText("Back");
        backb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ShowingPanel1Layout = new javax.swing.GroupLayout(ShowingPanel1);
        ShowingPanel1.setLayout(ShowingPanel1Layout);
        ShowingPanel1Layout.setHorizontalGroup(
            ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ShowingPanel1Layout.createSequentialGroup()
                .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShowingPanel1Layout.createSequentialGroup()
                        .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ShowingPanel1Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jLabel65))
                            .addGroup(ShowingPanel1Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imagelabel1)
                                    .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel66)
                                        .addComponent(jLabel61)
                                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(34, 34, 34)
                        .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sname1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sid1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scity1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ShowingPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(catagorychangeb, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ShowingPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(changebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addComponent(removeitemb, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowingPanel1Layout.createSequentialGroup()
                        .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel33)
                                .addComponent(jLabel32)
                                .addGroup(ShowingPanel1Layout.createSequentialGroup()
                                    .addComponent(negofield1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton16))
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowingPanel1Layout.createSequentialGroup()
                                .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ShowingPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addGap(22, 22, 22))
                                    .addGroup(ShowingPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel67)
                                        .addGap(18, 18, 18))
                                    .addGroup(ShowingPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel63)
                                        .addGap(18, 18, 18)))
                                .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(heavyfield, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(scompany1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(catfield, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowingPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sprice1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(backb, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowingPanel1Layout.createSequentialGroup()
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))))
        );
        ShowingPanel1Layout.setVerticalGroup(
            ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ShowingPanel1Layout.createSequentialGroup()
                .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagelabel1)
                    .addGroup(ShowingPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backb)))
                .addGap(54, 54, 54)
                .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShowingPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel64)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel65))
                    .addGroup(ShowingPanel1Layout.createSequentialGroup()
                        .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62)
                            .addComponent(sprice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66))
                        .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ShowingPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel61)))
                            .addGroup(ShowingPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(scompany1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel63))))
                        .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ShowingPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(scity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ShowingPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(heavyfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel67))
                                .addGap(21, 21, 21)
                                .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34)
                                    .addComponent(catfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jLabel32)
                                .addGap(18, 18, 18)
                                .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton16)
                                    .addGroup(ShowingPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(negofield1)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel33)))))
                .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ShowingPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(ShowingPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(changebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeitemb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(catagorychangeb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(86, Short.MAX_VALUE))
                    .addGroup(ShowingPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15)
                        .addContainerGap(142, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(index, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(customerRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(managerRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(managerFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(customerFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ShowingPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(index, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(customerRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(managerRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(managerFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(customerFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(ShowingPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int currentManagerLoggedIn=0;
    private void inputuseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputuseridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputuseridActionPerformed
     int whoisin=-2;
    private void imidfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imidfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imidfieldActionPerformed

    private void createbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbActionPerformed

       
 int tem=0;
     if("".equals(namefield.getText()) || "required".equals(namefield.getText())){
      namefield.setText("required");
    tem+=1;
    }
    if("".equals(emailfield.getText()) || "required".equals(emailfield.getText())){
        emailfield.setText("required");
     tem+=1;}
    
     if("".equals(cityfield.getText()) || "required".equals(cityfield.getText())){
        cityfield.setText("required");
     tem+=1;}
     
   
       
    if(!isNumeric(phonefield.getText())){ phonefield.setText("enter number only");
     tem++;
     }
    String pas=String.copyValueOf(passwordfield.getPassword());
     if( !pas.equalsIgnoreCase(String.copyValueOf(passwordfield2.getPassword()) )  ||  "".equalsIgnoreCase(pas)  )
    
     {tem++; JOptionPane.showMessageDialog(null," password dont match ");     }
    if(tem==0){try{
       FileInputStream file = new FileInputStream(new File("customerdatabase.xls"));
       HSSFWorkbook workbook = new HSSFWorkbook(file);
       HSSFSheet sheet = workbook.getSheetAt(0);
       int rd=sheet.getLastRowNum();
        rd++;
      Row row = sheet.createRow(rd);
     Cell cell = row.createCell(0);
     cell.setCellValue(rd+100);
  
    Cell cell2 = row.createCell(1);
    cell2.setCellValue(namefield.getText());
    Cell cell3 = row.createCell(2);
    cell3.setCellValue(pas);
     Cell cell4= row.createCell(3);
    cell4.setCellValue(cityfield.getText());
     Cell cell5= row.createCell(4);
    cell5.setCellValue(phonefield.getText());
     Cell cell6= row.createCell(5);
    cell6.setCellValue(emailfield.getText());
     Cell cell7= row.createCell(6);
    cell7.setCellValue(imidfield.getText());
    
      file.close();
            try {
    FileOutputStream out = new FileOutputStream(new File("customerdatabase.xls"));
    workbook.write(out);
    out.close();
    JOptionPane.showMessageDialog(null,"Mr."+namefield.getText()+""+" has been registered.Your User ID is:"
    +Integer.toString(rd+100)+". \nPlease Log-In with this ID and your password to continue.");
       namefield.setText("");
       passwordfield.setText("");
       passwordfield2.setText("");
       phonefield.setText("");
       emailfield.setText("");
       imidfield.setText("");
       cityfield.setText("");
       customerRegister.setVisible(false);
       index.setVisible(true);
       
} catch (FileNotFoundException e) {
    e.printStackTrace();};
      }catch(IOException ex){}
      }      
   




    }//GEN-LAST:event_createbActionPerformed

    private void passwordfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordfield2ActionPerformed

    private void custRegisterbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custRegisterbActionPerformed
            index.setVisible(false);
            customerRegister.setVisible(true);
    }//GEN-LAST:event_custRegisterbActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void managerCreatebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerCreatebActionPerformed
     int tem=0;
     if("".equals(mname.getText()) || "required".equals(mname.getText())){
      mname.setText("required");
    tem+=1;
    }
    if("".equals(memail.getText()) || "required".equals(memail.getText())){
        memail.setText("required");
     tem+=1;}
    
     if("".equals(maddress.getText()) || "required".equals(maddress.getText())){
        maddress.setText("required");
     tem+=1;}
     if("".equals(mbioid.getText()) || "required".equals(mbioid.getText())){
        mbioid.setText("required");
     tem+=1;}
   
       
    if(!isNumeric(mphone.getText())){ mphone.setText("enter number only");
     tem++;
     }
    String pas=String.copyValueOf(mpasswd1.getPassword());
     if( !pas.equalsIgnoreCase(String.copyValueOf(mpasswd2.getPassword()) )  ||  "".equalsIgnoreCase(pas)  )
    
     {tem++; JOptionPane.showMessageDialog(null," password dont match ");     }
    if(tem==0){try{
       FileInputStream file = new FileInputStream(new File("managerdatabase.xls"));
       HSSFWorkbook workbook = new HSSFWorkbook(file);
       HSSFSheet sheet = workbook.getSheetAt(0);
       int rd=sheet.getLastRowNum();
        rd++;
      Row row = sheet.createRow(rd);
     Cell cell = row.createCell(0);
     cell.setCellValue(rd+100);
  
    Cell cell2 = row.createCell(1);
    cell2.setCellValue(mname.getText());
    Cell cell3 = row.createCell(2);
    cell3.setCellValue(pas);
     Cell cell4= row.createCell(3);
    cell4.setCellValue(maddress.getText());
     Cell cell5= row.createCell(4);
    cell5.setCellValue(mphone.getText());
     Cell cell6= row.createCell(5);
    cell6.setCellValue(memail.getText());
     Cell cell7= row.createCell(6);
    cell7.setCellValue(mimid.getText());
    Cell cell8= row.createCell(7);
    cell8.setCellValue(mdob.getText());
    Cell cell9= row.createCell(8);
    int a=mgender.getSelectedIndex();String sp;
    if(a==0){ sp="male" ;} else  sp= "female" ;
    cell9.setCellValue(sp);
    Cell cell10= row.createCell(9);
    cell10.setCellValue(mbioid.getText());
    
    
      file.close();
            try {
    FileOutputStream out = new FileOutputStream(new File("managerdatabase.xls"));
    workbook.write(out);
    out.close();
    JOptionPane.showMessageDialog(null,"Mr."+mname.getText()+""+" has been registered. Your Manager ID is:"
    +Integer.toString(rd+100)+". \nPlease Log-In with this ID and your password to continue.");
    mname.setText("");
     mpasswd1.setText("");
       mpasswd2.setText("");
       mphone.setText("");
       memail.setText("");
       mimid.setText("");
       maddress.setText("");
        mbioid.setText("");
         mdob.setText("");
       managerRegister.setVisible(false);
        index.setVisible(true);
    
} catch (FileNotFoundException e) {
    e.printStackTrace();};
      }catch(IOException ex){}
      }               
    }//GEN-LAST:event_managerCreatebActionPerformed

    private void mgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mgenderActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      index.setVisible(false);
      managerRegister.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
            try{
            FileInputStream file = new FileInputStream(new File("managerdatabase.xls"));
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
            /////////////////////////////////////////////////////////////////////////////////////////
            int hisid=currentManagerLoggedIn;
            Row row = sheet.getRow(hisid);
            if(jTextField11.getText().equals("") || jTextField12.getText().equals("") || 
               jTextField13.getText().equals("") || jTextField14.getText().equals(""))
            {JOptionPane.showMessageDialog(null,"Fields cannot be left empty!");}
            else if (!isNumeric(jTextField12.getText()))
            {JOptionPane.showMessageDialog(null,"enter a valid phone number");}
            else{
            row.getCell(3).setCellValue(jTextField11.getText());
            row.getCell(4).setCellValue(jTextField12.getText());
            row.getCell(5).setCellValue(jTextField13.getText());
            row.getCell(6).setCellValue(jTextField14.getText());
            JOptionPane.showMessageDialog(null,"Changes updated!");
            }
            /////////////////////////////////////////////////////////////////////////////////////////
            file.close();
            try {
                
                 FileOutputStream out = new FileOutputStream(new File("managerdatabase.xls"));
                 workbook.write(out);
                 out.close();
            } 
            catch (FileNotFoundException e) {e.printStackTrace();}
        }
        catch(IOException ex){}
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void managerloginbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerloginbActionPerformed
numberperformed.setVisible(false);
totalmoney.setVisible(false);
managerbox.removeAllItems();
changebox.removeAllItems();
int masternumber=0;// used to determine if login was successful 
        String inputid=jTextField3.getText();
        String inputpassword=String.copyValueOf(mpass.getPassword());
        
        //checks
        int tem=0;
        if("".equals(jTextField3.getText()) || "required".equals(jTextField3.getText())){
           jTextField3.setText("required");
           tem+=1;
         }
         if(!isNumeric(jTextField3.getText())){JOptionPane.showMessageDialog(null," user id or password incorrect");tem+=1;}
        if(tem==0){
        try{
            
            FileInputStream file = new FileInputStream(new File("managerdatabase.xls"));
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
            /////////////////////////////////////////////////////////////////////////////////////////
            int hisid=Integer.parseInt(inputid)-100;
            int lastnum=sheet.getLastRowNum();
            if(hisid>lastnum){ JOptionPane.showMessageDialog(null," User not found!"); }
            else{
            Row row = sheet.getRow(hisid);
            
            String actualpassword=row.getCell(2).getStringCellValue();
            if(!actualpassword.equals(inputpassword)) {
                
               JOptionPane.showMessageDialog(null," Incorrect Password!"); 
               jTextField3.setText("");mpass.setText("");
            }
            else{ masternumber++;
                currentManagerLoggedIn=hisid;whoisin=1;mWelcome.setText("Welcome Mr. "+row.getCell(1).getStringCellValue());
                jTextField3.setText("");mpass.setText("");
                index.setVisible(false);
                managerFunctions.setVisible(true);
                jTabbedPane4.setVisible(true);
                jTextField7.setText(row.getCell(1).getStringCellValue());
                jTextField8.setText(row.getCell(8).getStringCellValue());
                jTextField9.setText(row.getCell(7).getStringCellValue());
                jTextField10.setText(row.getCell(9).getStringCellValue());
                jTextField11.setText(row.getCell(3).getStringCellValue());
                jTextField12.setText(row.getCell(4).getStringCellValue());
                jTextField13.setText(row.getCell(5).getStringCellValue());
                jTextField14.setText(row.getCell(6).getStringCellValue());
                //
                jTextField10.setEditable(false);jTextField9.setEditable(false);
                jTextField7.setEditable(false);jTextField8.setEditable(false);
             }}
            /////////////////////////////////////////////////////////////////////////////////////////
            file.close();
            try {
                 FileOutputStream out = new FileOutputStream(new File("managerdatabase.xls"));
                 workbook.write(out);
                 out.close();
            } 
            catch (FileNotFoundException e) {e.printStackTrace();}
        }
        catch(IOException ex){}
      } 
        //////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////
        if(masternumber>0){
        model=(DefaultTableModel)jTable3.getModel();
        model.setRowCount(0);
        //showing category table
        try {
              FileInputStream file = new FileInputStream(new File("categorydatabase.xls"));
              HSSFWorkbook workbook = new HSSFWorkbook(file);
              HSSFSheet sheet = workbook.getSheetAt(0);
              int k=sheet.getLastRowNum();
              int m1=0;
              for(int tem1=1;tem1<=k;tem1++){
                  if(!sheet.getRow(tem1).getCell(0).getStringCellValue().equals("")){
                  Cell name1 = sheet.getRow(tem1).getCell(0);
                  Row row1=sheet.getRow(tem1);
                  managerbox.addItem(name1.getStringCellValue());
                  changebox.addItem(name1.getStringCellValue());
                  
                  model.insertRow(m1,new Object[]{name1.getStringCellValue()});
                  m1++;}
           }   
            file.close();}
            catch(IOException ex){} 
          /////////////////////////////////////////////////////////////////
          model4=(DefaultTableModel)jTable1.getModel();
        model4.setRowCount(0);
        //showing customer table
        try {
              FileInputStream file = new FileInputStream(new File("customerdatabase.xls"));
              HSSFWorkbook workbook = new HSSFWorkbook(file);
              HSSFSheet sheet = workbook.getSheetAt(0);
              int k=sheet.getLastRowNum();
              int m1=0;
              for(int tem1=1;tem1<=k;tem1++){
                  if(sheet.getRow(tem1).getCell(0).getNumericCellValue()!=9999){
                  Cell name1 = sheet.getRow(tem1).getCell(1);
                  Cell id1=sheet.getRow(tem1).getCell(0);
                  Cell city1=sheet.getRow(tem1).getCell(3);
                  Row row1=sheet.getRow(tem1);
                  
                  model4.insertRow(m1,new Object[]{name1.getStringCellValue(),
                      (int) id1.getNumericCellValue(),city1.getStringCellValue()});
                  m1++;}
           }   
            file.close();}
            catch(IOException ex){} 
        //showing audit table
        model4=(DefaultTableModel)auditTable.getModel();
        model4.setRowCount(0);
        //showing customer table
        try {
              FileInputStream file = new FileInputStream(new File("itemdatabase.xls"));
              HSSFWorkbook workbook = new HSSFWorkbook(file);
              HSSFSheet sheet = workbook.getSheetAt(0);
              int k=sheet.getLastRowNum();
              int m1=0;
              for(int tem1=1;tem1<=k;tem1++){
                  if(sheet.getRow(tem1).getCell(12).getStringCellValue().equalsIgnoreCase("no")){
                    if(!sheet.getRow(tem1).getCell(10).getStringCellValue().equalsIgnoreCase("None")){
                  Row row1=sheet.getRow(tem1);
                  double sid=row1.getCell(0).getNumericCellValue();
                  String sname=row1.getCell(1).getStringCellValue();
                  String cata=row1.getCell(3).getStringCellValue();
                  String seller=row1.getCell(2).getStringCellValue();
                  String buyer=row1.getCell(10).getStringCellValue();
                  String company=row1.getCell(6).getStringCellValue();
                  String price=row1.getCell(4).getStringCellValue();
                  SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
        
                  Date solddate=row1.getCell(13).getDateCellValue();
                  String date = DATE_FORMAT.format(solddate);
                 
                  
                  model4.insertRow(m1,new Object[]{date,(int)sid,sname,cata,seller,buyer,price,company
                      });
                  m1++;}}
           }   
            file.close();}
            catch(IOException ex){} 
         model4=(DefaultTableModel)Negodisplaytable.getModel();
        model4.setRowCount(0);
        try { int m1=0;

                FileInputStream file = new FileInputStream(new File("negodatabase.xls"));
                HSSFWorkbook workbook = new HSSFWorkbook(file);
                HSSFSheet sheet = workbook.getSheetAt(0);
                int k=sheet.getLastRowNum();
                int m=0;int tem1=1;

                for( tem1=1;tem1<=k;tem1++)
                {     Row row=sheet.getRow(tem1);
                 SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
        
                  
                  
                      Date wstdate1=sheet.getRow(tem1).getCell(7).getDateCellValue();
                      String date1 = DATE_FORMAT.format(wstdate1);
                      String itemid=row.getCell(0).getStringCellValue();
                      String itemname=row.getCell(6).getStringCellValue();
                      String uploaderid=row.getCell(1).getStringCellValue();
                      String negoid=row.getCell(2).getStringCellValue();
                      String orgprice=row.getCell(3).getStringCellValue();
                      String negoprice=row.getCell(4).getStringCellValue();
                      String revprice=row.getCell(5).getStringCellValue();
                      
                        
                
                          model4.insertRow(m1,new Object[]{date1, itemid, itemname,uploaderid,negoid,orgprice,negoprice,revprice});
                        m1++;
                    

                }

                file.close();
        
        
        }   catch (FileNotFoundException ex) {    
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            } }   managerbox.setSelectedIndex(-1);
    }//GEN-LAST:event_managerloginbActionPerformed

    private void addcategorybActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcategorybActionPerformed
     if(!"".equals(jTextField6.getText())) 
             {    try{
            FileInputStream file = new FileInputStream(new File("categorydatabase.xls"));
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
            int rd=sheet.getLastRowNum();
            rd++;
            /////////////////////////////////////////////////////////////////////////////////////////
            int i=rd;
            
            Row row = sheet.createRow(i);
            String setit=jTextField6.getText();
            row.createCell(0);
            row.getCell(0).setCellValue(setit);
            row.createCell(1);
            row.getCell(1).setCellValue(0);
            jTextField6.setText("");
            /////////////////////////////////////////////////////////////////////////////////////////
            file.close();
            try {
                
                 FileOutputStream out = new FileOutputStream(new File("categorydatabase.xls"));
                 workbook.write(out);
                 out.close();
            } 
            catch (FileNotFoundException e) {e.printStackTrace();}
        }
        catch(IOException ex){}
        model=(DefaultTableModel)jTable3.getModel();
        model.setRowCount(0);
        try {
              FileInputStream file = new FileInputStream(new File("categorydatabase.xls"));
              HSSFWorkbook workbook = new HSSFWorkbook(file);
              HSSFSheet sheet = workbook.getSheetAt(0);
              int k=sheet.getLastRowNum();
              
              int m1=0;
              for(int tem1=1;tem1<=k;tem1++){
                  Cell name1 = sheet.getRow(tem1).getCell(0);
                  Cell num1=sheet.getRow(tem1).getCell(1);
                  Row row1=sheet.getRow(tem1);
                  if(!"".equalsIgnoreCase(name1.getStringCellValue()))
                  {model.insertRow(m1,new Object[]{name1.getStringCellValue()});
                  m1++;}
          
             }   
            file.close();}
            catch(IOException ex){} }
     else{JOptionPane.showMessageDialog(null,"enter a category name");}
        
    }//GEN-LAST:event_addcategorybActionPerformed
      
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
   int deletethis=jTable3.getSelectedRow();
   if(deletethis>=0){int checkcounter=0;
          model2=(DefaultTableModel)jTable3.getModel();  
            
            String catagoryselec=(String)jTable3.getValueAt(deletethis,0);
            
              try {
              FileInputStream file = new FileInputStream(new File("itemdatabase.xls"));
              HSSFWorkbook workbook = new HSSFWorkbook(file);
              HSSFSheet sheet = workbook.getSheetAt(0);
              int k=sheet.getLastRowNum();
              
              int m1=0;
              for(int tem1=1;tem1<=k;tem1++){
                  Cell cataname = sheet.getRow(tem1).getCell(3);
                  
                  Row row1=sheet.getRow(tem1);
                  if(cataname.getStringCellValue().equalsIgnoreCase(catagoryselec)){
               checkcounter++;
               break;   }
          
             }   
            file.close();}
            catch(IOException ex){} 
            if(checkcounter>0){ JOptionPane.showMessageDialog(null,"This category cannot be removed!");}
            else{
           
            try{
            FileInputStream file = new FileInputStream(new File("categorydatabase.xls"));
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
           
           
               
                int k=sheet.getLastRowNum();int m1=0;
                for(int tem1=1;tem1<=k;tem1++){
               Row row = sheet.getRow(tem1);
               String beforename=row.getCell(0).getStringCellValue();
               if(beforename.equalsIgnoreCase(catagoryselec)){
               row.getCell(0).setCellValue("");
               JOptionPane.showMessageDialog(null,"Category removed sucessfully!");
                   
               }
                    
                }
            
            /////////////////////////////////////////////////////////////////////////////////////////
            file.close();
            try {
                 FileOutputStream out = new FileOutputStream(new File("categorydatabase.xls"));
                 workbook.write(out);
                 out.close();
            } 
            catch (FileNotFoundException e) {e.printStackTrace();}
        }
        catch(IOException ex){}
         ((DefaultTableModel)jTable3.getModel()).removeRow(deletethis);  }}
   else{ JOptionPane.showMessageDialog(null,"select a row from table");}
    }//GEN-LAST:event_jButton8ActionPerformed
            int currentUserLoggedIn=0;
    private void CusLoginbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CusLoginbActionPerformed
    DefaultTableModel model44 = (DefaultTableModel) itemtable.getModel();
    model44.setRowCount(0);
    DefaultTableModel model444 = (DefaultTableModel) negotable.getModel();
    model444.setRowCount(0);
    sbox.removeAllItems();
    categorybox.removeAllItems();
    
    String inputid=inputuserid.getText();int masternumber=0;
        String inputpassword=String.copyValueOf(cpass.getPassword());
        userid=inputuserid.getText();
        //checks
        int tem=0;
        if("".equals(inputuserid.getText()) || "required".equals(inputuserid.getText())){
           inputuserid.setText("required");
           tem+=1;
         }
        if(!isNumeric(inputuserid.getText())){JOptionPane.showMessageDialog(null," user id or password incorrect");tem+=1;}
        if(tem==0){
        try{
            
            FileInputStream file = new FileInputStream(new File("customerdatabase.xls"));
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
            int lastrow=sheet.getLastRowNum();
            /////////////////////////////////////////////////////////////////////////////////////////
            int hisid=Integer.parseInt(inputid)-100;
            if(hisid>lastrow){ JOptionPane.showMessageDialog(null," user id or password incorrect"); }
            else{
            
            Row row = sheet.getRow(hisid);
            
            String actualpassword=row.getCell(2).getStringCellValue();
            if(!actualpassword.equals(inputpassword)) {
                
               JOptionPane.showMessageDialog(null," Incorrect User Id or Password!"); 
               inputuserid.setText("");cpass.setText("");
            }
            else{ masternumber++;
           
                currentUserLoggedIn=hisid;whoisin=0;
                inputuserid.setText("");cpass.setText("");
                index.setVisible(false);
                customerFunctions.setVisible(true);cWelcome.setText("Welcome Mr. "+row.getCell(1).getStringCellValue());
                jTabbedPane1.setVisible(true);
                
                
                cnamef.setText(sheet.getRow(hisid).getCell(1).getStringCellValue());
                cnamef.setEditable(false);
                ccityf.setText(sheet.getRow(hisid).getCell(3).getStringCellValue());
                cimidf.setText(sheet.getRow(hisid).getCell(6).getStringCellValue());
                cemailf.setText(sheet.getRow(hisid).getCell(5).getStringCellValue());
                cphnof.setText(sheet.getRow(hisid).getCell(4).getStringCellValue());
                cstcity=sheet.getRow(hisid).getCell(3).getStringCellValue();
                
            } }
            /////////////////////////////////////////////////////////////////////////////////////////
            file.close();
            try {
                 FileOutputStream out = new FileOutputStream(new File("customerdatabase.xls"));
                 workbook.write(out);
                 out.close();
            } 
            catch (FileNotFoundException e) {e.printStackTrace();}
        }
        catch(IOException ex){}
      } 
      /////////////////////////////////////////////////////////////////////////////////////////////
        
        if(masternumber>0){
        
        model=(DefaultTableModel)negotable.getModel();
      try {
    FileInputStream file = new FileInputStream(new File("negodatabase.xls"));
 
     HSSFWorkbook workbook = new HSSFWorkbook(file);
     HSSFSheet sheet = workbook.getSheetAt(0);
     int k=sheet.getLastRowNum(); 
     int m=0;
                 for(int tem1=1;tem1<=k;tem1++){  
                 Cell cell1 = sheet.getRow(tem1).getCell(2);   
                 if(  userid.equals(cell1.getStringCellValue())){
                 
                 Row row2=sheet.getRow(tem1);
                 String itemid=row2.getCell(0).getStringCellValue();
                  String uploaderid=row2.getCell(1).getStringCellValue();
                   String price=row2.getCell(3).getStringCellValue();
                    String negoprice=row2.getCell(4).getStringCellValue();
                     String newprice=row2.getCell(5).getStringCellValue();
                     String name=row2.getCell(6).getStringCellValue();
                     
                      model.insertRow(m,new Object[]{itemid,name,price,
                    negoprice,newprice});
                    m++;
        
              }
             }   
  file.close();}
   catch(IOException ex){ JOptionPane.showMessageDialog(null," has been uploaded.");}    
     
     
   model=(DefaultTableModel)sellertable.getModel();
   model.setRowCount(0);
    try {
    FileInputStream file = new FileInputStream(new File("itemdatabase.xls"));
 
     HSSFWorkbook workbook = new HSSFWorkbook(file);
     HSSFSheet sheet = workbook.getSheetAt(0);
     int k=sheet.getLastRowNum(); 
     int m=0;
                 for(int tem1=1;tem1<=k;tem1++){
                 Cell cell1 = sheet.getRow(tem1).getCell(2);
                 int uid=Integer.parseInt(userid);
                 if(userid.equalsIgnoreCase(cell1.getStringCellValue())){
                 
                 Row row2=sheet.getRow(tem1);
                 int itemid=(int)row2.getCell(0).getNumericCellValue();
               
                   String price=row2.getCell(4).getStringCellValue();
                    String company=row2.getCell(3).getStringCellValue();
                     String status=row2.getCell(12).getStringCellValue();
                     String name=row2.getCell(1).getStringCellValue();
                     if(status.equalsIgnoreCase("no")){status="sold";}
                       if(status.equalsIgnoreCase("yes")){status="available";}
                      model.insertRow(m,new Object[]{itemid,name,company,price,
                    status});
                    m++;
        
              }
             }   
  file.close();}
   catch(IOException ex){ JOptionPane.showMessageDialog(null," has been uploaded.");}    
     
   
   
    model=(DefaultTableModel)sellernegotable.getModel();
    model.setRowCount(0);
    try {
    FileInputStream file = new FileInputStream(new File("negodatabase.xls"));
 
     HSSFWorkbook workbook = new HSSFWorkbook(file);
     HSSFSheet sheet = workbook.getSheetAt(0);
     int k=sheet.getLastRowNum(); 
     int m=0;
                 for(int tem1=1;tem1<=k;tem1++){
                 Cell cell1 = sheet.getRow(tem1).getCell(1);
                
                 if(userid.equalsIgnoreCase(cell1.getStringCellValue())){
                 
                 Row row2=sheet.getRow(tem1);
                 String itemid=row2.getCell(0).getStringCellValue();
               
                   String price=row2.getCell(3).getStringCellValue();
                    String negoprice=row2.getCell(4).getStringCellValue();
                     String revprice=row2.getCell(5).getStringCellValue();
                     String name=row2.getCell(6).getStringCellValue();
                      String negoid=row2.getCell(2).getStringCellValue();
                   
                      model.insertRow(m,new Object[]{itemid,name,price,
                    negoprice,revprice,negoid});
                    m++;
        
              }
             }   
  file.close();}
   catch(IOException ex){ JOptionPane.showMessageDialog(null," has been uploaded.");}   
   
    try {
    FileInputStream file = new FileInputStream(new File("categorydatabase.xls"));
 
     HSSFWorkbook workbook = new HSSFWorkbook(file);
     HSSFSheet sheet = workbook.getSheetAt(0);
     int k=sheet.getLastRowNum(); 
     int m=0;
                 for(int tem1=1;tem1<=k;tem1++){
                 Cell cell1 = sheet.getRow(tem1).getCell(0);
                 String cat=cell1.getStringCellValue();
                 if(!cat.equals(""))
                 { sbox.addItem(cat);
                 categorybox.addItem(cat);
                
                   }
             
                 
                     }   
  file.close();}
   catch(IOException ex){ JOptionPane.showMessageDialog(null," has been uploaded.");}   
   
   
    
    
    
    }
       sbox.setSelectedIndex(-1); 
       
    }//GEN-LAST:event_CusLoginbActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         model2=(DefaultTableModel)jTable1.getModel();  
           // int deletethis=jTable1.getSelectedRow()+1;
             int selecnum=jTable1.getSelectedRow();
             int deleteguy=(int)jTable1.getValueAt(selecnum, 1)-100;
            // int deleteguy=Integer.parseInt(deleteid)-100;
            
            try{
            FileInputStream file = new FileInputStream(new File("customerdatabase.xls"));
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
            int rd=sheet.getLastRowNum();
            ////////////////////////////////////////////////////////////////////////////////////////
            Row row = sheet.getRow(deleteguy);
            //remove it some how here
                sheet.getRow(deleteguy).getCell(0).setCellValue(9999);
                sheet.getRow(deleteguy).getCell(2).setCellValue("9999");
                model3=(DefaultTableModel)jTable1.getModel();
                model3.setRowCount(0);
                int k=sheet.getLastRowNum();int m1=0;
                for(int tem1=1;tem1<=k;tem1++){
                    if(!(sheet.getRow(tem1).getCell(0).getNumericCellValue()==9999)){
                    Cell name1 = sheet.getRow(tem1).getCell(1);
                  Cell id1=sheet.getRow(tem1).getCell(0);
                  Cell city1=sheet.getRow(tem1).getCell(3);
                  Row row1=sheet.getRow(tem1);
                  
                  model3.insertRow(m1,new Object[]{name1.getStringCellValue(),
                      (int) id1.getNumericCellValue(),city1.getStringCellValue()});
                  m1++;
                    }
                }
            
            /////////////////////////////////////////////////////////////////////////////////////////
            file.close();
            try {
                 FileOutputStream out = new FileOutputStream(new File("customerdatabase.xls"));
                 workbook.write(out);
                 out.close();
            } 
            catch (FileNotFoundException e) {e.printStackTrace();}
        }
        catch(IOException ex){}
    }//GEN-LAST:event_jButton10ActionPerformed

    private void mchangepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mchangepasswordActionPerformed
          String hisoldgyan = String.copyValueOf(mopf.getPassword());
       String hisnewgyan = String.copyValueOf(mnpf.getPassword());
       String hisnewcgyan = String.copyValueOf(mcnpf.getPassword());
       String pas=String.copyValueOf(mnpf.getPassword());
     if(  "".equalsIgnoreCase(pas)  )
    
     { JOptionPane.showMessageDialog(null,"password cannot be empty ");     }
     else{
       try{
            
            FileInputStream file = new FileInputStream(new File("managerdatabase.xls"));
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
            /////////////////////////////////////////////////////////////////////////////////////////
            Row row = sheet.getRow(currentManagerLoggedIn);
            if(hisoldgyan.equals(row.getCell(2).getStringCellValue()) && hisnewcgyan.equals(hisnewgyan))
            {
                sheet.getRow(currentManagerLoggedIn).getCell(2).setCellValue(hisnewcgyan);
                JOptionPane.showMessageDialog(null,"Password successfully changed!");
                mopf.setText(""); mnpf.setText(""); mcnpf.setText("");
            }
            else
                JOptionPane.showMessageDialog(null, "Old password or confirm password do not match!");
                
             
            /////////////////////////////////////////////////////////////////////////////////////////
            file.close();
            try {
                 FileOutputStream out = new FileOutputStream(new File("managerdatabase.xls"));
                 workbook.write(out);
                 out.close();
            } 
            catch (FileNotFoundException e) {e.printStackTrace();}
        }
        catch(IOException ex){}  }
    }//GEN-LAST:event_mchangepasswordActionPerformed

    private void sname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sname1ActionPerformed

    private void sprice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sprice1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sprice1ActionPerformed

    private void scompany1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scompany1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scompany1ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        String Address= AddressArea.getText();int chu=0;
        String proid=sid1.getText();
        int ppid=Integer.parseInt(proid);
        String price=sprice1.getText();
        int foo=0;
 if(heavyfield.getText().equalsIgnoreCase("yes")){
     if(cstcity.equalsIgnoreCase(scity1.getText()))
     {foo=0;}
     else foo=-1;
 }
        if("".equals(Address)){JOptionPane.showMessageDialog( null,"Enter your address ");chu++;}
        else{
        if(foo==-1){JOptionPane.showMessageDialog( null,"The item is heavy, sorry cannot buy ");   }
        else{
            try {
                FileInputStream file = new FileInputStream(new File("itemdatabase.xls"));
                HSSFWorkbook workbook = new HSSFWorkbook(file);
                HSSFSheet sheet = workbook.getSheetAt(0);

                String avai=sheet.getRow(ppid-100).getCell(12).getStringCellValue();
                if(avai.equalsIgnoreCase("no")){ JOptionPane.showMessageDialog(this, "item not available, may be sold or removed");}
                else{
                    int dialogResult = JOptionPane.showConfirmDialog(this, "Please Pay rs"+price, "Confirm ",dialogButton);
                    if(dialogResult==0){

                        sheet.getRow(ppid-100).getCell(12).setCellValue("no");
                        sheet.getRow(ppid-100).getCell(10).setCellValue(userid);
                        sheet.getRow(ppid-100).getCell(4).setCellValue((String)price);
                        Date dt = new Date();
                        sheet.getRow(ppid-100).getCell(13).setCellValue(dt);}
                }
                file.close();
                try {
                    FileOutputStream out = new FileOutputStream(new File("itemdatabase.xls"));
                    workbook.write(out);
                    out.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();

                } }
                catch (IOException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

        } }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
 int chu=0;int reqcondition=0;
 int ppid=Integer.parseInt(sid1.getText());
 if(heavyfield.getText().equalsIgnoreCase("yes")){
     if(cstcity.equalsIgnoreCase(scity1.getText()))
     {chu=0;}
     else chu=-1;
 }
        
     
        
        if(negofield1.getText().equals("")){

            JOptionPane.showMessageDialog( null,"enter a negotiated price amount");
        }
        

        else{
            
           if(chu==-1){JOptionPane.showMessageDialog( null,"Cannot buy this item, its heavy");}
            
           else{
            
            try {
                FileInputStream file = new FileInputStream(new File("itemdatabase.xls"));
                HSSFWorkbook workbook = new HSSFWorkbook(file);
                HSSFSheet sheet = workbook.getSheetAt(0);

                String avai=sheet.getRow(ppid-100).getCell(12).getStringCellValue();
                if(avai.equalsIgnoreCase("no")){reqcondition++; JOptionPane.showMessageDialog(this, "item not available, may be sold or removed");}
                
                file.close();}
               
               catch (FileNotFoundException e) {
                    e.printStackTrace();} catch (IOException ex) {
                   Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
               }
               
               
              ///////////////////////////////////////////////////////////////////////////////
               
              
               if(reqcondition==0){
          
               
            try {
                FileInputStream file = new FileInputStream(new File("negodatabase.xls"));

                HSSFWorkbook workbook = new HSSFWorkbook(file);
                HSSFSheet sheet = workbook.getSheetAt(0);
                int k=sheet.getLastRowNum();
                int m1=0;int rd=k+1;
                Row row = sheet.createRow(rd);

                Cell cell2 = row.createCell(0);
                cell2.setCellValue(sid1.getText());
                Cell cell3 = row.createCell(1);
                cell3.setCellValue(puploaderid);
                Cell cell4 = row.createCell(2);
                cell4.setCellValue(userid);
                Cell cell45 = row.createCell(3);
                cell45.setCellValue(sprice1.getText());
                Cell cell5 = row.createCell(4);
                cell5.setCellValue(negofield1.getText());
                Cell cell6 = row.createCell(5);
                cell6.setCellValue("None");
                Cell cell7 = row.createCell(6);
                cell7.setCellValue(sname1.getText());
                
                ///////////////
                 Date dt = new Date();
                      
                Cell cell8 = row.createCell(7);
                cell8.setCellValue(dt);

                file.close();
                try {
                    FileOutputStream out = new FileOutputStream(new File("negodatabase.xls"));
                    workbook.write(out);
                    out.close();
                    JOptionPane.showMessageDialog( null,"Your negotiation request has been sent");

                } catch (FileNotFoundException e) {
                    e.printStackTrace();}

            }
            catch(IOException ex){}        // TODO add your handling code here:

        

        try{
            FileInputStream file = new FileInputStream(new File("itemdatabase.xls"));
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
            int proid = Integer.parseInt(sid1.getText());
            Cell cell2 = sheet.getRow(proid-100).getCell(12);
            cell2.setCellValue("Negotiating");

            file.close();
            try {
                FileOutputStream out = new FileOutputStream(new File("itemdatabase.xls"));
                workbook.write(out);
                out.close();

            }
            catch (FileNotFoundException e) {
                e.printStackTrace();};
        }catch(IOException ex){}}}}

    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       jLabel35.setVisible(false);
       changebox.setVisible(false);
       catagorychangeb.setVisible(false);
       removeitemb.setVisible(false);
       String findcat="";
       
       
        String uploader="";String heavy="no";
        model=(DefaultTableModel)itemtable.getModel();
        int chu=0;

        int id=0;
        int selecnum=itemtable.getSelectedRow();
        String id1="";

        if(selecnum>=0)
        {id= (int) model.getValueAt(selecnum, 0);chu++;
            id1= String.valueOf( model.getValueAt(selecnum, 0));
        }

        if(chu==0){JOptionPane.showMessageDialog(null,"please select an item from table");}

        else{

            String name=(String)model.getValueAt(selecnum, 1);
            String price=(String)model.getValueAt(selecnum, 2);
            String city=(String)model.getValueAt(selecnum, 5);
            String age=(String)model.getValueAt(selecnum, 3);
            String company =(String)model.getValueAt(selecnum, 6);
            sid1.setText(id1);
            sname1.setText(name);
            sprice1.setText(price);
            scity1.setText(city);
            scompany1.setText(company);

            jTabbedPane1.setVisible(false);
            ShowingPanel1.setVisible(true);
            customerFunctions.setVisible(false);

            int flag=0;
            model.setRowCount(0);
            try {

                FileInputStream file = new FileInputStream(new File("itemdatabase.xls"));
                HSSFWorkbook workbook = new HSSFWorkbook(file);
                HSSFSheet sheet = workbook.getSheetAt(0);
                int k=sheet.getLastRowNum();
                int m=0;
                Cell des=sheet.getRow(id-100).getCell(9);
                sdescription1.setText(des.getStringCellValue());
                Cell seller=sheet.getRow(id-100).getCell(2);
                puploaderid=String.valueOf(seller.getStringCellValue());
                heavy=sheet.getRow(id-100).getCell(8).getStringCellValue();
                findcat=sheet.getRow(id-100).getCell(3).getStringCellValue();

                file.close();}
            catch(IOException ex){} }
            catfield.setText(findcat);
        
        

        ImageIcon icon = new ImageIcon("ItemImages/"+sname1.getText()+".png");
        imagelabel1.setIcon(icon);
        heavyfield.setText(heavy);
        }

        private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
            jPanel3.setVisible(false);
            jPanel4.setVisible(false);

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int cnt=0;
        model=(DefaultTableModel)itemtable.getModel();
        model.setRowCount(0);
        String sitemname=searchitem.getText();
        String cata=(String)sbox.getSelectedItem();
        int bindex=sbox.getSelectedIndex();
        if("".equals(sitemname) && bindex==-1 ){JOptionPane.showMessageDialog( null,"please enter item name or select a category");cnt=-1; }
        else{
            if("".equals(sitemname)) cnt=0;
            else if( bindex==-1) cnt=1;
            else cnt=2;  }
        if(cnt>=0){
            try {
                FileInputStream file = new FileInputStream(new File("itemdatabase.xls"));
                HSSFWorkbook workbook = new HSSFWorkbook(file);
                HSSFSheet sheet = workbook.getSheetAt(0);
                int k=sheet.getLastRowNum();
                int m1=0;
                if(cnt==1){
                    for(int tem1=1;tem1<=k;tem1++){  Row row1=sheet.getRow(tem1);
                        Cell name1 = sheet.getRow(tem1).getCell(1);
                        if(sitemname.equalsIgnoreCase(name1.getStringCellValue())){
                            Cell id=sheet.getRow(tem1).getCell(0);
                            Cell price1 =sheet.getRow(tem1).getCell(4);
                            Cell city1=sheet.getRow(tem1).getCell(7);
                            Cell avail1=sheet.getRow(tem1).getCell(12);
                            Cell age1=sheet.getRow(tem1).getCell(5);
                            Cell company=sheet.getRow(tem1).getCell(6);

                            model.insertRow(m1,new Object[]{(int)id.getNumericCellValue(), name1.getStringCellValue(),
                                price1.getStringCellValue(),age1.getStringCellValue(),avail1.getStringCellValue(),
                                city1.getStringCellValue(),company.getStringCellValue()});m1++;
                        JOptionPane.showMessageDialog( null,"name trecec matched");
                    }   }}

                    else  { JOptionPane.showMessageDialog( null,cata);
                        for(int tem1=1;tem1<=k;tem1++){  Row row1=sheet.getRow(tem1);
                            Cell name1 = sheet.getRow(tem1).getCell(3);
                            if(cata.equals(name1.getStringCellValue())){ Cell id=sheet.getRow(tem1).getCell(0);
                                Cell name=sheet.getRow(tem1).getCell(1);
                                Cell price1 =sheet.getRow(tem1).getCell(4);
                                Cell city1=sheet.getRow(tem1).getCell(7);
                                Cell avail1=row1.getCell(12);
                                Cell age1=row1.getCell(5);
                                Cell company=sheet.getRow(tem1).getCell(6);

                                model.insertRow(m1,new Object[]{ (int)id.getNumericCellValue(),name.getStringCellValue(),
                                    price1.getStringCellValue(),age1.getStringCellValue(),
                                    avail1.getStringCellValue(),city1.getStringCellValue(),company.getStringCellValue()});m1++;

                        }   }}

                        file.close();}
                    catch(IOException ex){}

                }   
        sbox.setSelectedIndex(-1);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        model=(DefaultTableModel)negotable.getModel();
        int chu=0;

        int id=0;
        int selecnum=negotable.getSelectedRow();
        int ppid=Integer.parseInt((String)negotable.getValueAt(selecnum,0));int reqcondition=0;
        if(selecnum>=0){chu++;}
        String newnegoprice=nefield.getText();

        if(nefield.getText().equals("") || chu==0){

            JOptionPane.showMessageDialog( null,"enter a negotiated price amount or selecte item from field");
        }

        else{
            ////////////////////////////////
            try {
                FileInputStream file = new FileInputStream(new File("itemdatabase.xls"));
                HSSFWorkbook workbook = new HSSFWorkbook(file);
                HSSFSheet sheet = workbook.getSheetAt(0);

                String avai=sheet.getRow(ppid-100).getCell(12).getStringCellValue();
                if(avai.equalsIgnoreCase("no")){reqcondition++; JOptionPane.showMessageDialog(this, "item not available, may be sold or removed");}
                
                file.close();}
               
               catch (FileNotFoundException e) {
                    e.printStackTrace();} catch (IOException ex) { 
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            } 
            ///////////////////////////////////////
            
            if(reqcondition==0){
            
            
            
            
            String oldprice=(String)model.getValueAt(selecnum, 3);

            try {
                FileInputStream file = new FileInputStream(new File("negodatabase.xls"));

                HSSFWorkbook workbook = new HSSFWorkbook(file);
                HSSFSheet sheet = workbook.getSheetAt(0);
                int k=sheet.getLastRowNum();
                int m=0;int rd=k+1;int tem1=1;

                for( tem1=1;tem1<=k;tem1++)
                {
                    Cell cell1 = sheet.getRow(tem1).getCell(4);
                    if(oldprice.equals(cell1.getStringCellValue())){

                        cell1.setCellValue(nefield.getText());
                 Date dt = new Date();
                Cell cell8 = sheet.getRow(tem1).getCell(7);
                cell8.setCellValue(dt);

                        model.setValueAt(nefield.getText(), selecnum, 3);
                    }
                }

                file.close();
                try {
                    FileOutputStream out = new FileOutputStream(new File("negodatabase.xls"));
                    workbook.write(out);
                    out.close();
                    JOptionPane.showMessageDialog( null,"Your negotiation request has been sent");

                } catch (FileNotFoundException e) {
                    e.printStackTrace();}

            }
            catch(IOException ex){}        // TODO add your handling code here:

            }  }

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        model=(DefaultTableModel)negotable.getModel();
        int selecnum=negotable.getSelectedRow();
        if(selecnum>=0){
        String finalprice;
        String Address= deliverybox.getText();
        int chu=0;

        String proid=(String)negotable.getValueAt(selecnum, 0);
        int ppid=Integer.parseInt(proid);

        String nprice=(String)negotable.getValueAt(selecnum,3 );
        String rprice=(String)negotable.getValueAt(selecnum,4 );
        String realprice=(String)negotable.getValueAt(selecnum,2 );
        finalprice=rprice;
        if(rprice.equalsIgnoreCase("none")){finalprice=realprice;}

        if("".equals(Address)){JOptionPane.showMessageDialog( null,"Enter your address ");chu++;}
        else{
            int dialogButton = JOptionPane.YES_NO_OPTION;

            try {
                FileInputStream file = new FileInputStream(new File("itemdatabase.xls"));
                HSSFWorkbook workbook = new HSSFWorkbook(file);
                HSSFSheet sheet = workbook.getSheetAt(0);

                String avai=sheet.getRow(ppid-100).getCell(12).getStringCellValue();
                if(avai.equalsIgnoreCase("no")){ JOptionPane.showMessageDialog(this, "item not available, may be sold or removed");}
                else{
                    int dialogResult = JOptionPane.showConfirmDialog(this, "Please Pay rs"+finalprice, "Confirm ",dialogButton);
                    if(dialogResult==0){
                        sheet.getRow(ppid-100).getCell(12).setCellValue("no");
                        sheet.getRow(ppid-100).getCell(4).setCellValue((String)finalprice);
                        sheet.getRow(ppid-100).getCell(10).setCellValue(userid);
                        Date dt = new Date();
                        sheet.getRow(ppid-100).getCell(13).setCellValue(dt);}
                }
                file.close();

                try {
                    FileOutputStream out = new FileOutputStream(new File("itemdatabase.xls"));
                    workbook.write(out);
                    out.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();

                } }
                catch (IOException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            }}
        else{JOptionPane.showMessageDialog(null,"select item from table");}

    }//GEN-LAST:event_jButton18ActionPerformed

    private void revpricebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revpricebActionPerformed

        int selecnum=sellernegotable.getSelectedRow();
        if(selecnum>=0){
            String itemid=(String)sellernegotable.getValueAt(selecnum, 0);
            String oldprice=(String)sellernegotable.getValueAt(selecnum, 3);

            try {

                FileInputStream file = new FileInputStream(new File("negodatabase.xls"));
                HSSFWorkbook workbook = new HSSFWorkbook(file);
                HSSFSheet sheet = workbook.getSheetAt(0);
                int k=sheet.getLastRowNum();
                int m=0;int tem1=1;

                for( tem1=1;tem1<=k;tem1++)
                {
                    Cell cell1 = sheet.getRow(tem1).getCell(4);
                    Cell cell19 = sheet.getRow(tem1).getCell(0);
                    if(oldprice.equals(cell1.getStringCellValue())){

                        Cell cell2 = sheet.getRow(tem1).getCell(5);
                        cell2.setCellValue(revpricefield.getText());
                       Date dt = new Date();
                      
             
                       sheet.getRow(tem1).getCell(7).setCellValue(dt);
                
                        model.setValueAt(revpricefield.getText(), selecnum, 4);
                        JOptionPane.showMessageDialog(null,"price has been revised");
                    }

                }

                file.close();
                try {
                    FileOutputStream out = new FileOutputStream(new File("negodatabase.xls"));
                    workbook.write(out);
                    out.close();

                } catch (FileNotFoundException e) {
                    e.printStackTrace();}

            }
            catch(IOException ex){}        // TODO add your handling code here:

        }
        else JOptionPane.showMessageDialog(null, "select item from table");

    }//GEN-LAST:event_revpricebActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int tem=0;
        if("".equals(pname.getText()) || "required".equals(pname.getText())){
            pname.setText("required");
            tem+=1;
        }
        if("".equals(pcity.getText()) || "required".equals(pcity.getText())){
            pcity.setText("required");
            tem+=1;}

        if("".equals(pcompany.getText()) || "required".equals(pcompany.getText())){
            pcompany.setText("required");
            tem+=1;}
        if("".equals(pdescription.getText()) || "required".equals(pdescription.getText())){
            pdescription.setText("required");
            tem+=1;}

        if(!isNumeric(page.getText())){ page.setText("enter number only");
            tem++;
        }

        if(!isNumeric(pprice.getText())){ pprice.setText("enter number only");
            tem++;
        }

        if(tem==0){
            JFileChooser chooser= new JFileChooser();
            chooser.showOpenDialog(null);
            File f=chooser.getSelectedFile();
            String filename=f.getAbsolutePath();
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(filename));
            } catch (IOException e) {
            }
            try {
                // retrieve image
                BufferedImage bi =img;
                File outputfile = new File("ItemImages/"+pname.getText()+".png");
                ImageIO.write(img, "png", outputfile);
            } catch (IOException e) {

            }

            try{
                FileInputStream file = new FileInputStream(new File("itemdatabase.xls"));
                HSSFWorkbook workbook = new HSSFWorkbook(file);
                HSSFSheet sheet = workbook.getSheetAt(0);
                int rd=sheet.getLastRowNum();
                rd++;
                Row row = sheet.createRow(rd);
                Cell cell = row.createCell(0);
                cell.setCellValue(rd+100);

                Cell cell2 = row.createCell(1);
                cell2.setCellValue(pname.getText());
                Cell cell3 = row.createCell(2);
                cell3.setCellValue(userid);
                Cell cell4= row.createCell(3);
                String cat=(String)categorybox.getSelectedItem();
                cell4.setCellValue(cat);
                Cell cell5= row.createCell(4);
                cell5.setCellValue(pprice.getText());
                Cell cell6= row.createCell(5);
                cell6.setCellValue(page.getText());
                Cell cell7= row.createCell(6);
                cell7.setCellValue(pcompany.getText());
                Cell cell8= row.createCell(7);
                cell8.setCellValue(pcity.getText());
                Cell cell9= row.createCell(8);
                int a=heavybox.getSelectedIndex();String sp;
                if(a==0){ sp="no" ;} else  sp= "yes" ;
                cell9.setCellValue(sp);
                Cell cell10= row.createCell(9);
                cell10.setCellValue(pdescription.getText());
                Cell cell22= row.createCell(10);
                cell22.setCellValue("none");
                Cell cell23= row.createCell(11);
                cell23.setCellValue("instock");
                Cell cell24= row.createCell(12);
                cell24.setCellValue("yes");
                Cell cell25= row.createCell(13);
                cell25.setCellValue("no");

                file.close();
                try {
                    FileOutputStream out = new FileOutputStream(new File("itemdatabase.xls"));
                    workbook.write(out);
                    out.close();
                    JOptionPane.showMessageDialog(null,""+pname.getText()+""+" has been uploaded.");
                    pname.setText("");

                    pcity.setText("");
                    pprice.setText("");
                    pdescription.setText("");
                    pcompany.setText("");
                    pname.setText("");
                    page.setText("");

                } catch (FileNotFoundException e) {
                    e.printStackTrace();};
            }catch(IOException ex){}

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cchangebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cchangebActionPerformed
    if(isNumeric(cphnof.getText())) {   try{

            FileInputStream file = new FileInputStream(new File("customerdatabase.xls"));
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
            /////////////////////////////////////////////////////////////////////////////////////////

            Row row = sheet.getRow(currentUserLoggedIn);
            sheet.getRow(currentUserLoggedIn).getCell(3).setCellValue(ccityf.getText());
            sheet.getRow(currentUserLoggedIn).getCell(4).setCellValue(cphnof.getText());
            sheet.getRow(currentUserLoggedIn).getCell(5).setCellValue(cemailf.getText());
            sheet.getRow(currentUserLoggedIn).getCell(6).setCellValue(cimidf.getText());

            /////////////////////////////////////////////////////////////////////////////////////////
            file.close();
            try {
                FileOutputStream out = new FileOutputStream(new File("customerdatabase.xls"));
                workbook.write(out);
                out.close();JOptionPane.showMessageDialog(null,"profile has been edited");
            }
            catch (FileNotFoundException e) {e.printStackTrace();}
        }
        catch(IOException ex){}}
    else {JOptionPane.showMessageDialog(null,"please enter phone numer properly");}

    }//GEN-LAST:event_cchangebActionPerformed

    private void copfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_copfActionPerformed

    private void cchangepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cchangepasswordActionPerformed
        String hisoldgyan = String.copyValueOf(copf.getPassword());
        String hisnewgyan = String.copyValueOf(cnpf.getPassword());
        String hisnewcgyan = String.copyValueOf(ccnpf.getPassword());
        try{

            FileInputStream file = new FileInputStream(new File("customerdatabase.xls"));
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
            /////////////////////////////////////////////////////////////////////////////////////////
            Row row = sheet.getRow(currentUserLoggedIn);
            if(hisoldgyan.equals(row.getCell(2).getStringCellValue()) && hisnewcgyan.equals(hisnewgyan))
            {
                sheet.getRow(currentUserLoggedIn).getCell(2).setCellValue(hisnewcgyan);
                JOptionPane.showMessageDialog(null,"Password successfully changed!");
                copf.setText(""); cnpf.setText(""); ccnpf.setText("");
            }
            else
            JOptionPane.showMessageDialog(null, "Old password or confirm password do not match!");

            /////////////////////////////////////////////////////////////////////////////////////////
            file.close();
            try {
                FileOutputStream out = new FileOutputStream(new File("customerdatabase.xls"));
                workbook.write(out);
                out.close();
            }
            catch (FileNotFoundException e) {e.printStackTrace();}
        }
        catch(IOException ex){}
    }//GEN-LAST:event_cchangepasswordActionPerformed

    private void sboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sboxActionPerformed
      
    }//GEN-LAST:event_sboxActionPerformed

    private void managerboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_managerboxActionPerformed

    private void customerItemsSarchbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerItemsSarchbActionPerformed
        int cnt=0;
        model=(DefaultTableModel)jTable2.getModel();
        model.setRowCount(0);
        String sitemname=searchingbox.getText();
        String cata=(String)managerbox.getSelectedItem();
        int bindex=managerbox.getSelectedIndex();
        if("".equals(sitemname) && bindex==-1 ){JOptionPane.showMessageDialog( null,"please enter item name or select a category");cnt=-1; }
        else{
            if("".equals(sitemname)) cnt=0;
            else if( bindex==-1) cnt=1;
            else cnt=2;  }
        if(cnt>=0){
            try {
                FileInputStream file = new FileInputStream(new File("itemdatabase.xls"));
                HSSFWorkbook workbook = new HSSFWorkbook(file);
                HSSFSheet sheet = workbook.getSheetAt(0);
                int k=sheet.getLastRowNum();
                int m1=0;
                if(cnt==1){
                    for(int tem1=1;tem1<=k;tem1++){  Row row1=sheet.getRow(tem1);
                        Cell name1 = sheet.getRow(tem1).getCell(1);
                        if(sitemname.equalsIgnoreCase(name1.getStringCellValue())){
                            Cell id=sheet.getRow(tem1).getCell(0);
                            Cell price1 =sheet.getRow(tem1).getCell(4);
                            Cell city1=sheet.getRow(tem1).getCell(7);
                            Cell avail1=sheet.getRow(tem1).getCell(12);
                            Cell age1=sheet.getRow(tem1).getCell(5);
                            Cell company=sheet.getRow(tem1).getCell(6);

                            model.insertRow(m1,new Object[]{(int)id.getNumericCellValue(), name1.getStringCellValue(),
                                price1.getStringCellValue(),age1.getStringCellValue(),avail1.getStringCellValue(),
                                city1.getStringCellValue(),company.getStringCellValue()});m1++;
                        
                    }   }}

                    else  { 
                        for(int tem1=1;tem1<=k;tem1++){  Row row1=sheet.getRow(tem1);
                            Cell name1 = sheet.getRow(tem1).getCell(3);
                            if(cata.equals(name1.getStringCellValue())){ Cell id=sheet.getRow(tem1).getCell(0);
                                Cell name=sheet.getRow(tem1).getCell(1);
                                Cell price1 =sheet.getRow(tem1).getCell(4);
                                Cell city1=sheet.getRow(tem1).getCell(7);
                                Cell avail1=row1.getCell(12);
                                Cell age1=row1.getCell(5);
                                Cell company=sheet.getRow(tem1).getCell(6);

                                model.insertRow(m1,new Object[]{ (int)id.getNumericCellValue(),name.getStringCellValue(),
                                    price1.getStringCellValue(),age1.getStringCellValue(),
                                    avail1.getStringCellValue(),city1.getStringCellValue(),company.getStringCellValue()});m1++;

                        }   }}

                        file.close();}
                    catch(IOException ex){}

                }   
        managerbox.setSelectedIndex(-1);
        searchingbox.setText("");
        
        
    }//GEN-LAST:event_customerItemsSarchbActionPerformed

    private void REvqulaitymanagerbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REvqulaitymanagerbActionPerformed
        jLabel32.setVisible(false);
         jLabel33.setVisible(false);
        negofield1.setVisible(false);
         jButton16.setVisible(false);
         jScrollPane8.setVisible(false);
          AddressArea.setVisible(false);
          
           jButton15.setVisible(false);
       String findcat="";
       
        String uploader="";String heavy="no";
        model=(DefaultTableModel)jTable2.getModel();
        int chu=0;

        int id=0;
        int selecnum=jTable2.getSelectedRow();
        String id1="";

        if(selecnum>=0)
        {id= (int) model.getValueAt(selecnum, 0);chu++;
            id1= String.valueOf( model.getValueAt(selecnum, 0));
        }

        if(chu==0){JOptionPane.showMessageDialog(null,"please select an item from table");}

        else{

            String name=(String)model.getValueAt(selecnum, 1);
            String price=(String)model.getValueAt(selecnum, 2);
            String city=(String)model.getValueAt(selecnum, 5);
            String age=(String)model.getValueAt(selecnum, 3);
            String company =(String)model.getValueAt(selecnum, 6);
            sid1.setText(id1);
            sname1.setText(name);
            sprice1.setText(price);
            scity1.setText(city);
            scompany1.setText(company);

            jTabbedPane4.setVisible(false);
            managerFunctions.setVisible(false);
            ShowingPanel1.setVisible(true);
          

            int flag=0;
            model.setRowCount(0);
            try {

                FileInputStream file = new FileInputStream(new File("itemdatabase.xls"));
                HSSFWorkbook workbook = new HSSFWorkbook(file);
                HSSFSheet sheet = workbook.getSheetAt(0);
                int k=sheet.getLastRowNum();
                int m=0;
                Cell des=sheet.getRow(id-100).getCell(9);
                sdescription1.setText(des.getStringCellValue());
                Cell seller=sheet.getRow(id-100).getCell(2);
                puploaderid=String.valueOf(seller.getStringCellValue());
                heavy=sheet.getRow(id-100).getCell(8).getStringCellValue();
                findcat=sheet.getRow(id-100).getCell(3).getStringCellValue();

                file.close();}
            catch(IOException ex){} }
            catfield.setText(findcat);
        
        

        ImageIcon icon = new ImageIcon("ItemImages/"+sname1.getText()+".png");
        imagelabel1.setIcon(icon);
        heavyfield.setText(heavy);
             
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_REvqulaitymanagerbActionPerformed

    private void sid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sid1ActionPerformed

    private void catagorychangebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catagorychangebActionPerformed
    int changeid=Integer.parseInt(sid1.getText());
    int chkk=changebox.getSelectedIndex();
    if(chkk==-1){JOptionPane.showMessageDialog(null,"Select a category first!");}
    else {
    String newcat=(String)changebox.getSelectedItem();
    
        
        try{
            FileInputStream file = new FileInputStream(new File("itemdatabase.xls"));
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
             sheet.getRow(changeid-100).getCell(3).setCellValue(newcat);
           
               
                
               //
                   
              
            
            /////////////////////////////////////////////////////////////////////////////////////////
            file.close();
            try {
                 FileOutputStream out = new FileOutputStream(new File("itemdatabase.xls"));
                 workbook.write(out);
                 out.close();
            } 
            catch (FileNotFoundException e) {e.printStackTrace();}
        }
        catch(IOException ex){}
        JOptionPane.showMessageDialog(null,"Category changed sucessfully!");}
    }//GEN-LAST:event_catagorychangebActionPerformed

    private void scity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scity1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scity1ActionPerformed

    private void changeboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_changeboxActionPerformed

    private void removeitembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeitembActionPerformed
        int changeid=Integer.parseInt(sid1.getText());
   
        
        try{
            FileInputStream file = new FileInputStream(new File("itemdatabase.xls"));
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
            if(    sheet.getRow(changeid-100).getCell(12).getStringCellValue().equalsIgnoreCase("no"))
            {
            
            JOptionPane.showMessageDialog(null,"Cannot remove, The item is not available");  
            
            }  else
            {sheet.getRow(changeid-100).getCell(12).setCellValue("no");
            JOptionPane.showMessageDialog(null,"The item has been removed");   }
           
               
                
               //
                   
              
            
            /////////////////////////////////////////////////////////////////////////////////////////
            file.close();
            try {
                 FileOutputStream out = new FileOutputStream(new File("itemdatabase.xls"));
                 workbook.write(out);
                 out.close();
            } 
            catch (FileNotFoundException e) {e.printStackTrace();}
        }
        catch(IOException ex){}
            
        
        
        
        
        
    }//GEN-LAST:event_removeitembActionPerformed

    private void backbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbActionPerformed
        if(whoisin==0){       
        ShowingPanel1.setVisible(false);
        customerFunctions.setVisible(true);
        jTabbedPane1.setVisible(true);}
        else if(whoisin==1)
        {
        ShowingPanel1.setVisible(false);
        managerFunctions.setVisible(true);
        jTabbedPane4.setVisible(true);
        }
        
    }//GEN-LAST:event_backbActionPerformed

    private void viewauditbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewauditbActionPerformed
        model4=(DefaultTableModel)auditTable.getModel();
        model4.setRowCount(0);
        //showing customer table
        try {
              FileInputStream file = new FileInputStream(new File("itemdatabase.xls"));
              HSSFWorkbook workbook = new HSSFWorkbook(file);
              HSSFSheet sheet = workbook.getSheetAt(0);
              int k=sheet.getLastRowNum();
              int m1=0;
              for(int tem1=1;tem1<=k;tem1++){
                  if(sheet.getRow(tem1).getCell(12).getStringCellValue().equalsIgnoreCase("no")){
                     if(!sheet.getRow(tem1).getCell(10).getStringCellValue().equalsIgnoreCase("None")){
                      
                  
                  Row row1=sheet.getRow(tem1);
                  double sid=row1.getCell(0).getNumericCellValue();
                  String sname=row1.getCell(1).getStringCellValue();
                  String cata=row1.getCell(3).getStringCellValue();
                  String seller=row1.getCell(2).getStringCellValue();
                  String buyer=row1.getCell(10).getStringCellValue();
                  String company=row1.getCell(6).getStringCellValue();
                  String price=row1.getCell(4).getStringCellValue();
                  SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
        
                  Date solddate=row1.getCell(13).getDateCellValue();
                  String date = DATE_FORMAT.format(solddate);
                 
                  
                  model4.insertRow(m1,new Object[]{date,(int)sid,sname,cata,seller,buyer,price,company
                      });
                  m1++;}}
           }   
            file.close();}
            catch(IOException ex){}    
        
        int m=0;int sumsold=0;
        int lastrow=auditTable.getRowCount();
        for(int i=0;i<lastrow;i++){
        String date=(String)auditTable.getValueAt(m, 0);
         if(!datebox.getText().equals(date)){
             {  
         ((DefaultTableModel)auditTable.getModel()).removeRow(m);m--;
        
             }
             
    }
         else{int money=Integer.parseInt((String)auditTable.getValueAt(m, 6));sumsold=sumsold+money;  }
  m++;
    }
        
        
     numberperformed.setText("Number of transaction performed on "+datebox.getText()+" :"+m);
     totalmoney.setText("Total sum of transactions::"+sumsold);
      numberperformed.setVisible(true);
               totalmoney.setVisible(true);
        
        
    }//GEN-LAST:event_viewauditbActionPerformed

    private void mLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLogOutActionPerformed
        index.setVisible(true);managerFunctions.setVisible(false);
        jTabbedPane4.setVisible(false);
    }//GEN-LAST:event_mLogOutActionPerformed

    private void cLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cLogOutActionPerformed
        index.setVisible(true);customerFunctions.setVisible(false);
        jTabbedPane1.setVisible(false);
    }//GEN-LAST:event_cLogOutActionPerformed

    private void viewsellerbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewsellerbActionPerformed
        int selecnum=Negodisplaytable.getSelectedRow();
        if(selecnum>=0){
        String upid=(String)Negodisplaytable.getValueAt(selecnum, 3);
        String negid=(String)Negodisplaytable.getValueAt(selecnum, 4);
        int upid1=Integer.parseInt(upid)-100;
          int negid1=Integer.parseInt(negid)-100;
         
        //showing customer table
        try {
              FileInputStream file = new FileInputStream(new File("customerdatabase.xls"));
              HSSFWorkbook workbook = new HSSFWorkbook(file);
              HSSFSheet sheet = workbook.getSheetAt(0);
              Row row=sheet.getRow(upid1);
              String phone=row.getCell(4).getStringCellValue();
              String mail=row.getCell(5).getStringCellValue();
              JOptionPane.showMessageDialog(null, "Phone  "+phone+"  Mail:  "+mail);
             
            file.close();}
            catch(IOException ex){}           
        
        
        
        
    }else{JOptionPane.showMessageDialog(null, "Choose a row");}
    }//GEN-LAST:event_viewsellerbActionPerformed

    private void negocbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negocbActionPerformed
      int selecnum=Negodisplaytable.getSelectedRow();
      if(selecnum>=0){  String upid=(String)Negodisplaytable.getValueAt(selecnum, 3);
        String negid=(String)Negodisplaytable.getValueAt(selecnum, 4);
        int upid1=Integer.parseInt(upid)-100;
          int negid1=Integer.parseInt(negid)-100;
        
        //showing customer table
        try {
              FileInputStream file = new FileInputStream(new File("customerdatabase.xls"));
              HSSFWorkbook workbook = new HSSFWorkbook(file);
              HSSFSheet sheet = workbook.getSheetAt(0);
              Row row=sheet.getRow(negid1);
              String phone=row.getCell(4).getStringCellValue();
              String mail=row.getCell(5).getStringCellValue();
              JOptionPane.showMessageDialog(null, "Phone::"+phone+"...Mail::  "+mail);
             
            file.close();}
            catch(IOException ex){}    }   else{ JOptionPane.showMessageDialog(null, "Choose a row");   
      }
        
    }//GEN-LAST:event_negocbActionPerformed

    private void mcnpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcnpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcnpfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if(sellertable.getSelectedRow()>=0){  int changeid=((int)sellertable.getValueAt(sellertable.getSelectedRow(), 0));
   
        
        try{
            FileInputStream file = new FileInputStream(new File("itemdatabase.xls"));
            HSSFWorkbook workbook = new HSSFWorkbook(file);
            HSSFSheet sheet = workbook.getSheetAt(0);
            if(    sheet.getRow(changeid-100).getCell(12).getStringCellValue().equalsIgnoreCase("no"))
            {
            
            JOptionPane.showMessageDialog(null,"Cannot remove, The item is not available");  
            
            }  else
            {sheet.getRow(changeid-100).getCell(12).setCellValue("no");
            JOptionPane.showMessageDialog(null,"The item has been removed");   }
           
               
                
               //
                   
              
            
            /////////////////////////////////////////////////////////////////////////////////////////
            file.close();
            try {
                 FileOutputStream out = new FileOutputStream(new File("itemdatabase.xls"));
                 workbook.write(out);
                 out.close();
            } 
            catch (FileNotFoundException e) {e.printStackTrace();}
        }
        catch(IOException ex){}
            
        
        
     }
     else{JOptionPane.showMessageDialog(null,"Select an item from table"); }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AddressArea;
    private javax.swing.JButton CusLoginb;
    private javax.swing.JTable Negodisplaytable;
    private javax.swing.JLabel Password_label;
    private javax.swing.JButton REvqulaitymanagerb;
    private javax.swing.JPanel ShowingPanel1;
    private javax.swing.JLabel UserId_label;
    private javax.swing.JButton addcategoryb;
    private javax.swing.JTable auditTable;
    private javax.swing.JButton backb;
    private javax.swing.JButton cLogOut;
    private javax.swing.JLabel cWelcome;
    private javax.swing.JButton catagorychangeb;
    private javax.swing.JComboBox categorybox;
    private javax.swing.JTextField catfield;
    private javax.swing.JButton cchangeb;
    private javax.swing.JButton cchangepassword;
    private javax.swing.JTextField ccityf;
    private javax.swing.JPasswordField ccnpf;
    private javax.swing.JTextField cemailf;
    private javax.swing.JComboBox changebox;
    private javax.swing.JTextField cimidf;
    private javax.swing.JTextField cityfield;
    private javax.swing.JTextField cnamef;
    private javax.swing.JLabel cnamelabel;
    private javax.swing.JPasswordField cnpf;
    private javax.swing.JPasswordField copf;
    private javax.swing.JPasswordField cpass;
    private javax.swing.JTextField cphnof;
    private javax.swing.JButton createb;
    private javax.swing.JButton custRegisterb;
    private javax.swing.JPanel customerFunctions;
    private javax.swing.JButton customerItemsSarchb;
    private javax.swing.JPanel customerRegister;
    private javax.swing.JTextField datebox;
    private javax.swing.JTextArea deliverybox;
    private javax.swing.JTextField emailfield;
    private javax.swing.JComboBox heavybox;
    private javax.swing.JTextField heavyfield;
    private javax.swing.JFileChooser imagechooser;
    public javax.swing.JLabel imagelabel1;
    private javax.swing.JTextField imidfield;
    private javax.swing.JPanel index;
    private javax.swing.JTextField inputuserid;
    private javax.swing.JTable itemtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton mLogOut;
    private javax.swing.JLabel mWelcome;
    private javax.swing.JTextField maddress;
    private javax.swing.JButton managerCreateb;
    private javax.swing.JPanel managerFunctions;
    private javax.swing.JPanel managerRegister;
    private javax.swing.JComboBox managerbox;
    private javax.swing.JButton managerloginb;
    private javax.swing.JTextField mbioid;
    private javax.swing.JButton mchangepassword;
    private javax.swing.JPasswordField mcnpf;
    private javax.swing.JTextField mdob;
    private javax.swing.JTextField memail;
    private javax.swing.JComboBox mgender;
    private javax.swing.JTextField mimid;
    private javax.swing.JTextField mname;
    private javax.swing.JPasswordField mnpf;
    private javax.swing.JPasswordField mopf;
    private javax.swing.JPasswordField mpass;
    private javax.swing.JPasswordField mpasswd1;
    private javax.swing.JPasswordField mpasswd2;
    private javax.swing.JTextField mphone;
    private javax.swing.JTextField namefield;
    private javax.swing.JTextField nefield;
    private javax.swing.JButton negocb;
    private javax.swing.JTextField negofield1;
    private javax.swing.JTable negotable;
    private javax.swing.JLabel numberperformed;
    private javax.swing.JTextField page;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JPasswordField passwordfield2;
    private javax.swing.JTextField pcity;
    private javax.swing.JTextField pcompany;
    private javax.swing.JTextArea pdescription;
    private javax.swing.JTextField phonefield;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField pprice;
    private javax.swing.JButton removeitemb;
    private javax.swing.JButton revpriceb;
    private javax.swing.JTextField revpricefield;
    private javax.swing.JComboBox sbox;
    private javax.swing.JTextField scity1;
    private javax.swing.JTextField scompany1;
    private javax.swing.JTextArea sdescription1;
    private javax.swing.JTextField searchingbox;
    private javax.swing.JTextField searchitem;
    private javax.swing.JTable sellernegotable;
    private javax.swing.JTable sellertable;
    private javax.swing.JTextField sid1;
    private javax.swing.JTextField sname1;
    private javax.swing.JTextField sprice1;
    private javax.swing.JLabel totalmoney;
    private javax.swing.JButton viewauditb;
    private javax.swing.JButton viewsellerb;
    // End of variables declaration//GEN-END:variables
}
