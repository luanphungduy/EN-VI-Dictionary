import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyVocabulary extends javax.swing.JFrame {
    public MyVocabulary(JList<String> JListMyvocabulary, JLabel jLabel1, JScrollPane jScrollPane1, JButton returnApp, GraphicsConfiguration gc) {
        super(gc);
        this.JListMyvocabulary = JListMyvocabulary;
        this.jLabel1 = jLabel1;
        this.jScrollPane1 = jScrollPane1;
        this.returnApp = returnApp;
    }

    public MyVocabulary(JList<String> JListMyvocabulary, JLabel jLabel1, JScrollPane jScrollPane1, JButton returnApp) throws HeadlessException {
        this.JListMyvocabulary = JListMyvocabulary;
        this.jLabel1 = jLabel1;
        this.jScrollPane1 = jScrollPane1;
        this.returnApp = returnApp;
    }

    public MyVocabulary(JLabel jLabel1, JScrollPane jScrollPane1, JTextArea jTextArea1) throws HeadlessException {
        this.jLabel1 = jLabel1;
    }

    public MyVocabulary() throws IOException {
        initComponents();
        
        DefaultListModel listModel = new DefaultListModel();//bang de set cho Jlist
        ////////////////////// Đọc ghi file//////////////////////
        FileInputStream inputStream;
         InputStreamReader inputStreamReader;
        try {
            inputStream = new FileInputStream("Vocabulary.txt");
            inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        } catch (FileNotFoundException e) {
            inputStreamReader = new InputStreamReader(Objects.requireNonNull(getClass().getResourceAsStream("E_V.txt")),StandardCharsets.UTF_8);
        }
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            int index = line.indexOf('<');
            String target = line.substring(0, index);
            String explain = line.substring(index);
            listModel.addElement(explain);// add cac gia tri vao bang Jlist
        }
      
        JListMyvocabulary.setModel(listModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JListMyvocabulary = new javax.swing.JList<>();
        returnApp = new javax.swing.JButton();
        DoneLearn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kho từ của bạn");
        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Các từ bạn mới học được");

        JListMyvocabulary.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        JListMyvocabulary.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(JListMyvocabulary);

        returnApp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        returnApp.setText("Về trang chủ");
        returnApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnAppActionPerformed(evt);
            }
        });

        DoneLearn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        DoneLearn.setText("Đã thuộc hết");
        DoneLearn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneLearnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                        .addComponent(returnApp)
                        .addGap(38, 38, 38)
                        .addComponent(DoneLearn))
                    .addComponent(jScrollPane1))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(returnApp)
                    .addComponent(DoneLearn))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnAppActionPerformed
        // doc du lieu
        FileInputStream inputStream;
        InputStreamReader inputStreamReader;
        try {
            inputStream = new FileInputStream("Vocabulary.txt");
            inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        } catch (FileNotFoundException e) {
            inputStreamReader = new InputStreamReader(Objects.requireNonNull(getClass().getResourceAsStream("E_V.txt")),StandardCharsets.UTF_8);
        }
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //
       
        String line;
        try {
            if( (line = bufferedReader.readLine()) != null){
                JOptionPane.showMessageDialog(null, "Nếu bạn chưa nhớ nghĩa hãy quay lại tra từ nhé ", "Suggest!", JOptionPane.NO_OPTION);
            } 
        } catch (IOException ex) {
            Logger.getLogger(MyVocabulary.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(JListMyvocabulary.getSelectedValue());
        this.dispose();
    }//GEN-LAST:event_returnAppActionPerformed

    private void DoneLearnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneLearnActionPerformed
        DefaultListModel listModel = new DefaultListModel();
        JListMyvocabulary.setModel(listModel);
        //////////////////Luu vao kho tu
               
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Vocabulary.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Writer writer = null;
        try {
            writer = new java.io.OutputStreamWriter(fileOutputStream, "utf8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        try {
            bufferedWriter.write("");
        } catch (IOException ex) {
            Logger.getLogger(MyVocabulary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DoneLearnActionPerformed
  
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyVocabulary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyVocabulary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyVocabulary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyVocabulary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MyVocabulary myVocab = new MyVocabulary();
                    myVocab.setVisible(true);
                    myVocab.setResizable(false);
                    
                } catch (IOException ex) {
                    Logger.getLogger(MyVocabulary.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoneLearn;
    private javax.swing.JList<String> JListMyvocabulary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton returnApp;
    // End of variables declaration//GEN-END:variables
}
