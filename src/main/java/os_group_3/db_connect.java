/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package os_group_3;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author johnl
 */
public class db_connect {
    static Firestore db;
    static Component frame;
    public static void connect_db(){
        try{
            FileInputStream serviceAccount = new FileInputStream("databaseKey.json");
            
            FirebaseOptions options = new FirebaseOptions.Builder().setCredentials(GoogleCredentials.fromStream(serviceAccount)).build();
            FirebaseApp.initializeApp(options);
            db = FirestoreClient.getFirestore();
            JOptionPane.showMessageDialog(frame,"Database Connected",
                                         "Connected Successfully!",
                                         JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception e){
           JOptionPane.showMessageDialog(frame,e,
                                         "Connection error!",
                                         JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
