import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    public String voicePeople ="";
    List<Word> listWordVoca = new ArrayList<>();
    private final ListWord LW; // doi tuong chua tat ca du lieu
    TextToSpeech tts = new TextToSpeech();
    
    public void wordListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_wordListValueChanged

    }//GEN-LAST:event_wordListValueChanged

    public Main() {

        initComponents();
 
        jEditorExplant.setContentType("text/html");

        LW = new ListWord();

        try {
            LW.insertFromFile();// ham  doc du lieu tu file txt
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultListModel listModel = new DefaultListModel();//bang de set cho Jlist
        for (Word word : LW.words) {
            listModel.addElement(word.getWord_target());// add cac gia tri vao bang Jlist
        }
        jListWords.setModel(listModel); // tao bang cac tu 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListWords = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorExplant = new javax.swing.JEditorPane();
        addVocabulary = new javax.swing.JButton();
        patchVocabulary = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtInputWord = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        addWordButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        voiceButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EN-VN Dictionary");
        setBackground(new java.awt.Color(255, 204, 204));

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jListWords.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jListWords.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListWords.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListWordsValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListWords);

        jEditorExplant.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jScrollPane1.setViewportView(jEditorExplant);

        addVocabulary.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addVocabulary.setText("Thêm vào kho từ");
        addVocabulary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVocabularyActionPerformed(evt);
            }
        });

        patchVocabulary.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        patchVocabulary.setText("Vào kho từ ");
        patchVocabulary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patchVocabularyActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\EN-VI-Dictionary\\image\\search.png")); // NOI18N
        jLabel1.setName(""); // NOI18N

        txtInputWord.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtInputWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInputWordKeyReleased(evt);
            }
        });

        deleteButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\EN-VI-Dictionary\\image\\delete.png")); // NOI18N
        deleteButton.setToolTipText("Xóa từ");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        addWordButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\EN-VI-Dictionary\\image\\addWord.png")); // NOI18N
        addWordButton.setToolTipText("Thêm từ");
        addWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWordButtonActionPerformed(evt);
            }
        });

        modifyButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\EN-VI-Dictionary\\image\\pen.png")); // NOI18N
        modifyButton.setToolTipText("Sửa nghĩa của từ");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        voiceButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\EN-VI-Dictionary\\image\\voice.png")); // NOI18N
        voiceButton.setToolTipText("Nghe");
        voiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voiceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(patchVocabulary, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(addVocabulary, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(txtInputWord))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(19, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addWordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(voiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modifyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addWordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(voiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInputWord, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patchVocabulary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addVocabulary, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInputWordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputWordKeyReleased
        int index = LW.preBinarySearch(txtInputWord.getText());
        jListWords.setSelectedIndex(index);
        jListWords.ensureIndexIsVisible(index); // tu dong keo thanh cuon xuong
    }//GEN-LAST:event_txtInputWordKeyReleased

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int x = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa không");
        if(x==JOptionPane.YES_OPTION){
            DefaultListModel mod = (DefaultListModel) jListWords.getModel();
            int index = jListWords.getSelectedIndex();
            if (index != -1) {
                LW.removeWord(index);
                mod.remove(index);
                jEditorExplant.setContentType("text");
                jEditorExplant.setText("");
                jEditorExplant.setContentType("text/html");
                JOptionPane.showMessageDialog(null, "Xoá từ thành công", "Delete Word!", JOptionPane.NO_OPTION);
            }
        }
       
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void voiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voiceButtonActionPerformed
        int index = jListWords.getSelectedIndex();
        if (index == -1) {
            return;
        }
        String tar = jListWords.getSelectedValue();
        tts.speakText(tar);
    }//GEN-LAST:event_voiceButtonActionPerformed

    private void addWordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWordButtonActionPerformed
        AddWord addWord = new AddWord(LW, jListWords);
        addWord.setVisible(true);
        addWord.setResizable(false);
        addWord.setLocationRelativeTo(null);
    }//GEN-LAST:event_addWordButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        int index = jListWords.getSelectedIndex();
        if (index < 0) {
            return;
        }
        ModifyWord modifyWord = new ModifyWord(LW, index, jEditorExplant);
        modifyWord.setVisible(true);
        modifyWord.setResizable(false);
        modifyWord.setLocationRelativeTo(null);
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void patchVocabularyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patchVocabularyActionPerformed
        MyVocabulary myvoca;
        try {
            myvoca = new MyVocabulary();
            myvoca.setVisible(true);
            myvoca.setResizable(false);
            myvoca.setLocationRelativeTo(null);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_patchVocabularyActionPerformed

    private void addVocabularyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVocabularyActionPerformed
        int index = jListWords.getSelectedIndex();
        Word word = LW.words.get(index);
        JOptionPane.showMessageDialog(this, "Bạn mới thêm từ "+word.word_target+" vào kho từ vựng");
        listWordVoca.add(word);// ghi vao mang vocabulary
        ///////////////////////////////GHi vao file TXT//////////////////

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
        for (Word w : listWordVoca) {
            try {
                bufferedWriter.write(w.getWord_target() + w.getWord_explain() + '\n');
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            bufferedWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addVocabularyActionPerformed

    private void jListWordsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListWordsValueChanged
        int index = jListWords.getSelectedIndex();

        if (index != -1) {
            jEditorExplant.setContentType("text/html");
            jEditorExplant.setText(LW.words.get(index).getWord_explain());
            jEditorExplant.setCaretPosition(0);
        }
    }//GEN-LAST:event_jListWordsValueChanged

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //*************************************************************
        // Bắt đầu code ở đây //

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main main = new Main();
                main.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    int result = JOptionPane.showConfirmDialog(main,
                        "Do you want to Exit ?", "Exit Confirmation : ",
                        JOptionPane.YES_NO_OPTION);
                    if (result == JOptionPane.YES_OPTION)
                        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    else if (result == JOptionPane.NO_OPTION)
                        main.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
                });
                main.setVisible(true);
                main.setResizable(false);
                main.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVocabulary;
    private javax.swing.JButton addWordButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JEditorPane jEditorExplant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jListWords;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton patchVocabulary;
    private javax.swing.JTextField txtInputWord;
    private javax.swing.JButton voiceButton;
    // End of variables declaration//GEN-END:variables
}
