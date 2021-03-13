package com.team10.trojancheckinout.model;

import android.net.Uri;

import com.google.firebase.auth.*;
import com.google.firebase.firestore.*;
import com.google.firebase.storage.*;

public class Server {
    private static FirebaseAuth auth;
    private static FirebaseFirestore db;
    private static FirebaseStorage storage;

    private static final String[] majors = { "Major 1", "Major 2" };

    // TODO: delete later
    private static final Student testStudent =
        new Student(0, "Test", "User", "test@usc.edu", "https://upload.wikimedia.org/wikipedia/commons/b/bb/Kittyply_edit1.jpg", "CSCI");

    public static void initialize() {
        auth = FirebaseAuth.getInstance();
        db = FirebaseFirestore.getInstance();
        storage = FirebaseStorage.getInstance();

        // TODO: anything else
    }

    public static String[] getMajors() { return majors; }

    public static User getCurrentUser() {
        // TODO: replace this
        return testStudent;
    }

    // TODO: remove this
    public static User getCurrentUser_manager() {
        return new Manager("0", "Test", "Manager", "test@usc.edu", "https://upload.wikimedia.org/wikipedia/commons/b/bb/Kittyply_edit1.jpg");
    }

    public static void getStudent(String id, Callback<Student> callback) {
        // TODO: replace this
        callback.onSuccess(testStudent);
    }

    public static void logout(Callback<Void> callback){
        //TODO: replace this
    }

    public static void changePassword(String newPassword, Callback<Void> callback){
        //TODO: replace this
    }

    public static void changePhoto(Uri uri, Callback<String> callback){
        //TODO: replace this
    }

    public static void deleteAccount(Callback<Void> callback){
        //TODO: replace this
    }

    public static void getBuilding(String id, Callback<Building> callback) {
        // TODO: replace this
        callback.onSuccess(new Building(id, id, "", 30));
    }

    public static void checkIn(String id, Callback<Void> callback){
        //TODO: replace this
    }

    public static void checkOut(String id, Callback<Void> callback){
        //TODO: replace this
    }

    public static void listenForBuildings(Listener<Building> listener) {
        // TODO: replace this
        listener.onAdd(new Building("Building 1", "Building 1", "", 10));
        listener.onAdd(new Building("Building 2", "Building 2", "", 20));
    }
    
    public static void listenForCheckedInStudents(String buildingId, Listener<Student> listener) {
        // TODO: listen to query "students where student's current building = building id"
        listener.onAdd(testStudent);
    }

    public static void searchHistory(int startYear, int startMonth, int startDay, int startHour, int startMin,
                                     int endYear, int endMonth, int endDay, int endHour, int endMin,
                                     String buildingName, long studentId, String major,
                                     Callback<Record> callback) { // TODO: change to listener? technically a callback would suffice, though, b/c records are never removed/updated
        // TODO: replace this
        callback.onSuccess(new Record(buildingName, true));
        callback.onSuccess(new Record(buildingName, false));
        callback.onSuccess(new Record(buildingName, true));
    }

    // Based upon https://github.com/michelleran/TrojanCheckInOut/pull/27
    public static void logOutUser() {}
    public static void changePassword(String newPassword) {}
    public static void changePhotoUrl(Uri file, Callback<String> callback){
        //TODO: remove this (for testing purposes)
        callback.onSuccess("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Glazed-Donut.jpg/1200px-Glazed-Donut.jpg");
    }


}
