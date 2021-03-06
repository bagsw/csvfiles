package csvfiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.io.File;
import java.awt.*;
import java.util.HashMap;
import java.util.HashSet;
import java.io.BufferedWriter;


public class CSVJFrame extends javax.swing.JFrame {

   
    public CSVJFrame() {
        initComponents();
    }
    Random rand = new Random();
    Gen generate = new Gen();    
    int i;
    int k;
    int r;
    boolean a;
    boolean b;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Create file1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Create file2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Create file3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try
        {
            
            boolean[] isKey;
            isKey = new boolean[10000000];
                for (int i=0; i<1000000; i++)
                {
                    isKey[i]=false;
                }
            HashSet<Integer> hset1 = new HashSet<>();
            FileWriter filewr = new FileWriter("D:\\SLAVA\\f1.csv", false);
            BufferedWriter bufferedWriter = new BufferedWriter(filewr);
            for (i = 0 ; i < 1000000 ; i++)
            {
                do
                {
                    k = rand.nextInt(9999999);
                    
                } while (isKey[k]==true);
                isKey[k]=true;
                r = Integer.toString(k).length();
                
                switch (r)
                {
                    case 1: bufferedWriter.write("00000000"+k+","+  generate.Generate()+"\n");
                    break;
                    case 2: bufferedWriter.write("0000000"+k+","+  generate.Generate()+"\n");
                    break;
                    case 3: bufferedWriter.write("000000"+k+","+  generate.Generate()+"\n");
                    break;
                    case 4: bufferedWriter.write("00000"+k+","+  generate.Generate()+"\n");
                    break;
                    case 5: bufferedWriter.write("0000"+k+","+  generate.Generate()+"\n");
                    break;
                    case 6: bufferedWriter.write("000"+k+","+  generate.Generate()+"\n");
                    break;
                    case 7: bufferedWriter.write("00"+k+","+  generate.Generate()+"\n");
                    break;
                }
            }
            bufferedWriter.close();
            filewr.close();
            Desktop.getDesktop().open(new File("D:\\SLAVA\\f1.csv"));

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try
        {
            
            boolean[] isKey;
            isKey = new boolean[10000000];
                for (int i=0; i<1000000; i++)
                {
                    isKey[i]=false;
                }
            FileWriter filewr = new FileWriter("D:\\SLAVA\\f2.csv", false);
            BufferedWriter bufferedWriter = new BufferedWriter(filewr);
            for (i = 0 ; i < 1000000 ; i++)
            {
                do
                {
                    k = rand.nextInt(9999999);
                    
                } while (isKey[k]==true);
                isKey[k]=true;
                r = Integer.toString(k).length();
                
                switch (r)
                {
                    case 1: bufferedWriter.write("00000000"+k+","+  generate.Generate()+"\n");
                    break;
                    case 2: bufferedWriter.write("0000000"+k+","+  generate.Generate()+"\n");
                    break;
                    case 3: bufferedWriter.write("000000"+k+","+  generate.Generate()+"\n");
                    break;
                    case 4: bufferedWriter.write("00000"+k+","+  generate.Generate()+"\n");
                    break;
                    case 5: bufferedWriter.write("0000"+k+","+  generate.Generate()+"\n");
                    break;
                    case 6: bufferedWriter.write("000"+k+","+  generate.Generate()+"\n");
                    break;
                    case 7: bufferedWriter.write("00"+k+","+  generate.Generate()+"\n");
                    break;
                }
            }
            bufferedWriter.close();
            filewr.close();
            Desktop.getDesktop().open(new File("D:\\SLAVA\\f2.csv"));

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String value;
        int key;
        String s;
        /*HashMap<String, String> hmap1 = new HashMap<>();
        HashMap<String, String> hmap2 = new HashMap<>();
        HashSet<String> hset = new HashSet<>();
        */
        String[] file1;
        file1 = new String[10000000];
        String[] file2;
        file2 = new String[10000000];
        for (int i=0; i<10000000; i++){
            file1[i]="";
            file2[i]="";
        }
        try
        {
            FileReader reader1 = new FileReader("D:\\SLAVA\\f1.csv");
            FileReader reader2 = new FileReader("D:\\SLAVA\\f2.csv");
            BufferedReader bufferedReader1 = new BufferedReader(reader1);
            BufferedReader bufferedReader2 = new BufferedReader(reader2);
            FileWriter filewr = new FileWriter("D:\\SLAVA\\f3.csv", false);
            BufferedWriter bufferedWriter = new BufferedWriter(filewr);
            //key = bufferedReader2.readLine();
            //key = bufferedReader1.readLine();
            for (i = 0; i < 1000000; i++)
            {
                value = bufferedReader2.readLine();
                key = Integer.parseInt(value.substring(0,9));
                value = value.substring(10);
                //hmap2.put(key, value);
                //hset.add(key);
                file1[key] = value.substring(10);
            }
            for (i = 0; i < 1000000; i++)
            {
                value = bufferedReader1.readLine();
                key = Integer.parseInt(value.substring(0,9));
                value = value.substring(10);
                file2[key] = value.substring(10);   
            }
            /*for (String key1 : hset)
            {
                String s2 = hmap2.getOrDefault(key1, "");
                System.out.println(key1 +"\n");
            }*/
            for(int i=0; i<10000000; i++)
            {
                if (!(file1[i].equals("")) && !(file2[i].equals(""))){
                    s="";
                    k = i;
                    r = 0;
                    do{
                       r++;
                       k = k/10;
                    } while (k != 0);
                    switch (r){
                        case 1: bufferedWriter.write("00000000"+i+",");
                    break;
                    case 2: bufferedWriter.write("0000000"+i+",");
                    break;
                    case 3: bufferedWriter.write("000000"+i+",");
                    break;
                    case 4: bufferedWriter.write("00000"+i+",");
                    break;
                    case 5: bufferedWriter.write("0000"+i+",");
                    break;
                    case 6: bufferedWriter.write("000"+i+",");
                    break;
                    case 7: bufferedWriter.write("00"+i+",");
                    break;
               }
                    bufferedWriter.append(file1[i]+","+file2[i]+"\n");
                }
            
            }  
            bufferedWriter.close();
            filewr.close();
            bufferedReader1.close();
            bufferedReader2.close();
            Desktop.getDesktop().open(new File("D:\\SLAVA\\f3.csv"));

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }                                        
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CSVJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CSVJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CSVJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CSVJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CSVJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration                   
}
