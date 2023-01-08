//package com.example.yum_rafid;
//
//import static com.google.firebase.firestore.FirebaseFirestore.getInstance;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.os.Bundle;
//
//import com.firebase.ui.firestore.FirestoreRecyclerOptions;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.firestore.CollectionReference;
//import com.google.firebase.firestore.FirebaseFirestore;
//
//
//public class MainActivity_Rafid extends AppCompatActivity {
//
//    /**
//     *
//     */
//    public FirebaseFirestore db;
//    public final CollectionReference notebookRef = db.collection("restaurants");
//    private RestaurantAdapter adapter;
//
//    public MainActivity_Rafid() {
//        db = getInstance();
//    }
//
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        FirebaseApp.initializeApp(this);
//        setContentView(R.layout.activity_main_Rafid);
//        setUpRecyclerView();
//    }
//
//    private void setUpRecyclerView(){
//        FirestoreRecyclerOptions<Restaurant> options = new FirestoreRecyclerOptions.Builder<Restaurant>().build();
//        adapter = new RestaurantAdapter(options);
//
//        RecyclerView recyclerView = findViewById(R.id.restaurantsList);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager((this)));
//        recyclerView.setAdapter(adapter);
//
//    }
//    @Override
//    protected void onStart(){
//        super.onStart();
//        adapter.startListening();
//
//    }
//    @Override
//    protected void onStop(){
//        super.onStop();
//        adapter.stopListening();
//
//    }
//
//    public CollectionReference getNotebookRef() {
//        return notebookRef;
//    }
//}