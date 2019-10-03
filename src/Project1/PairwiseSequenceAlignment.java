package Project1;

/**
 * Kevin DeWire
 * CS 723 Introduction to Bioinformatics
 * Implementation of the Needleman Wunsch method of global alignment
 */
public class PairwiseSequenceAlignment extends javax.swing.JFrame {

    /**
     * Creates new form UserInterface
     */
    public PairwiseSequenceAlignment() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MatchValueLabel = new javax.swing.JLabel();
        MatchValueTextField = new javax.swing.JTextField();
        MismatchValueLabel = new javax.swing.JLabel();
        MismatchValueTextField = new javax.swing.JTextField();
        GapValueLabel = new javax.swing.JLabel();
        GapValueTextField = new javax.swing.JTextField();
        String1Label = new javax.swing.JLabel();
        String1TextField = new javax.swing.JTextField();
        String2Label = new javax.swing.JLabel();
        String2TextField = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        OptimalScoreLabel = new javax.swing.JLabel();
        OptimalScoreTextField = new javax.swing.JTextField();
        OptimalString1Label = new javax.swing.JLabel();
        OptimalString1TextField = new javax.swing.JTextField();
        OptimalString2Label = new javax.swing.JLabel();
        OptimalString2TextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pairwise Sequence Alignment");

        MatchValueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MatchValueLabel.setText("Match Value:");

        MatchValueTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MatchValueTextField.setToolTipText("Enter an integer");
        MatchValueTextField.setFocusCycleRoot(true);
        MatchValueTextField.setNextFocusableComponent(MismatchValueTextField);
        MatchValueTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatchValueTextFieldActionPerformed(evt);
            }
        });

        MismatchValueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MismatchValueLabel.setText("Mismatch Value:");

        MismatchValueTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MismatchValueTextField.setToolTipText("Enter an integer");
        MismatchValueTextField.setNextFocusableComponent(GapValueTextField);
        MismatchValueTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MismatchValueTextFieldActionPerformed(evt);
            }
        });

        GapValueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GapValueLabel.setText("Gap Value:");

        GapValueTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GapValueTextField.setToolTipText("Enter an integer");
        GapValueTextField.setNextFocusableComponent(String1TextField);
        GapValueTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GapValueTextFieldActionPerformed(evt);
            }
        });

        String1Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        String1Label.setText("String 1:");

        String1TextField.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        String1TextField.setToolTipText("Enter a string of characters");
        String1TextField.setNextFocusableComponent(String2TextField);

        String2Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        String2Label.setText("String 2:");

        String2TextField.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        String2TextField.setToolTipText("Enter a string of characters");
        String2TextField.setNextFocusableComponent(SubmitButton);

        SubmitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SubmitButton.setText("SUBMIT");
        SubmitButton.setNextFocusableComponent(MatchValueTextField);
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        ResetButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ResetButton.setText("RESET");
        ResetButton.setFocusable(false);
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        OptimalScoreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        OptimalScoreLabel.setText("Optimal Alignment Score:");

        OptimalScoreTextField.setEditable(false);
        OptimalScoreTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        OptimalScoreTextField.setFocusable(false);

        OptimalString1Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        OptimalString1Label.setText("Optimal String 1:");

        OptimalString1TextField.setEditable(false);
        OptimalString1TextField.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        OptimalString1TextField.setToolTipText("Enter a string of characters");
        OptimalString1TextField.setFocusable(false);

        OptimalString2Label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        OptimalString2Label.setText("Optimal String 2:");

        OptimalString2TextField.setEditable(false);
        OptimalString2TextField.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        OptimalString2TextField.setToolTipText("Enter a string of characters");
        OptimalString2TextField.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OptimalString1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OptimalString2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(OptimalString2TextField)
                    .addComponent(OptimalString1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SubmitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ResetButton)
                        .addGap(257, 257, 257))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MatchValueLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MatchValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MismatchValueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MismatchValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(GapValueLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(GapValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(String2Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(String1Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(String2TextField)
                                    .addComponent(String1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(OptimalScoreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OptimalScoreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ResetButton, SubmitButton});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {GapValueTextField, MatchValueTextField, MismatchValueTextField});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {OptimalString1TextField, OptimalString2TextField, String1TextField, String2TextField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(GapValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GapValueLabel)
                    .addComponent(MismatchValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MismatchValueLabel)
                    .addComponent(MatchValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MatchValueLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(String1Label)
                    .addComponent(String1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(String2Label)
                    .addComponent(String2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(SubmitButton)
                    .addComponent(ResetButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OptimalScoreLabel)
                    .addComponent(OptimalScoreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OptimalString1Label)
                    .addComponent(OptimalString1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OptimalString2Label)
                    .addComponent(OptimalString2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MatchValueTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatchValueTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatchValueTextFieldActionPerformed

    private void MismatchValueTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MismatchValueTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MismatchValueTextFieldActionPerformed

    private void GapValueTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GapValueTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GapValueTextFieldActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        // Clear all text fields and set focus at MatchValueTextField
       
        MatchValueTextField.setText("");
        MismatchValueTextField.setText("");
        GapValueTextField.setText("");
        String1TextField.setText("");
        String2TextField.setText("");
        OptimalScoreTextField.setText("");
        OptimalString1TextField.setText("");
        OptimalString2TextField.setText("");
        MatchValueTextField.requestFocus();
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // Pull the values from the text fields and proccess them.
        
        // Set up variables
        int MatchValue = Integer.parseInt(MatchValueTextField.getText());
        int MismatchValue = Integer.parseInt(MismatchValueTextField.getText());
        int GapValue = Integer.parseInt(GapValueTextField.getText());
        String String1 = String1TextField.getText();
        String String2 = String2TextField.getText();
        int OptimalScore;
        String OptimalString1 = "";
        String OptimalString2 = "";
        int X = String1.length();
        int Y = String2.length();
        SCORE = new int[X+1][Y+1];
        DIRECTION = new char[X+1][Y+1];
        
        // Create the tables
        InitScore(GapValue, X, Y);
        CalcScore(MatchValue, MismatchValue, GapValue, X, Y, String1, String2);
        
        // Assign values
        OptimalScore = SCORE[X][Y];
        
        // Get Optimal Strings
        OptimalString1 = PrintOptimalX(String1, OptimalString1, X, Y);
        OptimalString2 = PrintOptimalY(String2, OptimalString2, X, Y);
        
        // Test section
        //OptimalString1 = String2;
        //OptimalString2 = String1;
        for (int j=0; j<=Y; j++){
            for (int i=0; i<=X; i++){
                System.out.print(SCORE[i][j]);
            }
            System.out.println();
        }
        
        // Output
        OptimalScoreTextField.setText(String.valueOf(OptimalScore));
        OptimalString1TextField.setText(OptimalString1);
        OptimalString2TextField.setText(OptimalString2);
        
        
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void InitScore(int Gap, int X, int Y){
        SCORE[0][0]=0;
        
        for (int i=1; i<=X; i++){
            SCORE[i][0] = SCORE[i-1][0] + Gap;
        }
        
        for (int j=1; j<=Y; j++){
            SCORE[0][j] = SCORE[0][j-1] + Gap;
        }
    }
    
    private void CalcScore(int Match, int Miss, int Gap, int X, int Y, String stringX, String stringY){
        int diag;
        int up;
        int left;
        for (int j=1; j<=Y; j++){
            for (int i=1; i<=X; i++){
                diag = Diag(Match, Miss, i, j, stringX, stringY);
                up = Up(Gap, i, j);
                left = Left(Gap, i, j);
                if (diag >= up && diag >= left){
                    SCORE[i][j] = diag;
                    DIRECTION[i][j]='D';
                }
                else if(up >= left){
                    SCORE[i][j] = up;
                    DIRECTION[i][j]='U';
                }
                else {
                    SCORE[i][j] = left;
                    DIRECTION[i][j]='L';
                }
            }
        }
       
    }
    
    private int Diag(int Match, int Miss, int i, int j, String stringX, String stringY){
        int diag;
        int score;
        if (stringX.charAt(i-1) == stringY.charAt(j-1)){
            score = Match;
        }       
        else score = Miss;
        diag = SCORE[i-1][j-1] + score;
        return diag;
    }
    
    private int Up(int Gap, int i, int j){
        int up;
        up = SCORE[i][j-1] + Gap;
        return up;
    }
    
    private int Left(int Gap, int i, int j){
        int left;
        left = SCORE[i-1][j] + Gap;
        return left;
    }
    
    private String PrintOptimalX(String StringX, String OptimalX, int i, int j){
        if (i == 0 &&  j == 0){
            return OptimalX;
        }
        if (DIRECTION[i][j]=='D'){
            OptimalX = PrintOptimalX(StringX, OptimalX, i-1, j-1);
            OptimalX = OptimalX + StringX.charAt(i-1);
        }
        else if (DIRECTION[i][j]=='L' || j == 0){
            OptimalX = PrintOptimalX(StringX, OptimalX, i-1, j);
            OptimalX = OptimalX + StringX.charAt(i-1);
        }
        else{
            OptimalX = PrintOptimalX(StringX, OptimalX, i, j-1);
            OptimalX = OptimalX + '-';
        }
        return OptimalX;
    }
    
    private String PrintOptimalY(String StringY, String OptimalY, int i, int j){
        if (i == 0 &&  j == 0){
            return OptimalY;
        }
        if (DIRECTION[i][j]=='D'){
            OptimalY = PrintOptimalY(StringY, OptimalY, i-1, j-1);
            OptimalY = OptimalY + StringY.charAt(j-1);
        }
        else if (DIRECTION[i][j]=='U' || i == 0){
            OptimalY = PrintOptimalY(StringY, OptimalY, i, j-1);
            OptimalY = OptimalY + StringY.charAt(j-1);
        }
        else {
                OptimalY = PrintOptimalY(StringY, OptimalY, i-1, j);
                OptimalY = OptimalY + '-';
        }
        return OptimalY;
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
            java.util.logging.Logger.getLogger(PairwiseSequenceAlignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PairwiseSequenceAlignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PairwiseSequenceAlignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PairwiseSequenceAlignment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PairwiseSequenceAlignment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GapValueLabel;
    private javax.swing.JTextField GapValueTextField;
    private javax.swing.JLabel MatchValueLabel;
    private javax.swing.JTextField MatchValueTextField;
    private javax.swing.JLabel MismatchValueLabel;
    private javax.swing.JTextField MismatchValueTextField;
    private javax.swing.JLabel OptimalScoreLabel;
    private javax.swing.JTextField OptimalScoreTextField;
    private javax.swing.JLabel OptimalString1Label;
    private javax.swing.JTextField OptimalString1TextField;
    private javax.swing.JLabel OptimalString2Label;
    private javax.swing.JTextField OptimalString2TextField;
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel String1Label;
    private javax.swing.JTextField String1TextField;
    private javax.swing.JLabel String2Label;
    private javax.swing.JTextField String2TextField;
    private javax.swing.JButton SubmitButton;
    // End of variables declaration//GEN-END:variables

    // More variables for the required tables
    int[][] SCORE;
    char[][] DIRECTION;
    // End of table declarations
}
