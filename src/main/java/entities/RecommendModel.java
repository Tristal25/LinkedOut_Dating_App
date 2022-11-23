package entities;

import Gateway.DatabaseConnect;

import javax.management.InvalidAttributeValueException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecommendModel {

    private String workingdir;

    private DatabaseConnect db;

    public RecommendModel(String workingdir){
        this.workingdir = workingdir;
        this.db = new DatabaseConnect(workingdir);
    }

    private void UpdatePopular(String username) throws IOException {
        String[] command = {"python", String.format("%s/src/main/recommendmodel/recommend.py", this.workingdir),
                String.format("%s/src/main/data", this.workingdir), "popular", String.format("--username=%s", username)};

        String s;
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(command);

        System.out.println("Here is the standard output of the command:\n");
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }
        BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        // Read any errors from the attempted command
        System.out.println("Here is the standard error of the command (if any):\n");
        while ((s = stdError.readLine()) != null) {
            System.out.println(s);
        }
    }

    private void UpdatePopular(String username, int k) throws IOException {
        String[] command = {"python", String.format("%s/src/main/recommendmodel/recommend.py", this.workingdir),
                String.format("%s/src/main/data", this.workingdir), "popular", String.format("--username=%s", username),
                String.format("--maxusers=%o", k)};

        String s;
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(command);

        System.out.println("Here is the standard output of the command:\n");
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }
        BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        // Read any errors from the attempted command
        System.out.println("Here is the standard error of the command (if any):\n");
        while ((s = stdError.readLine()) != null) {
            System.out.println(s);
        }
    }
    private void UpdateSimilar(String username, String userviewed, int k) throws IOException {
        String[] command = {"python", String.format("%s/src/main/recommendmodel/recommend.py", this.workingdir),
                String.format("%s/src/main/data", this.workingdir), "similar", String.format("--username=%s", username),
                String.format("--userviewed=%s", userviewed), String.format("--maxusers=%o", k)};

        String s;
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(command);

        System.out.println("Here is the standard output of the command:\n");
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }
        BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        // Read any errors from the attempted command
        System.out.println("Here is the standard error of the command (if any):\n");
        while ((s = stdError.readLine()) != null) {
            System.out.println(s);
        }
    }

    private void UpdateSimilar(String username, String userviewed) throws IOException {
        String[] command = {"python", String.format("%s/src/main/recommendmodel/recommend.py", this.workingdir),
                String.format("%s/src/main/data", this.workingdir), "similar", String.format("--username=%s", username),
                String.format("--userviewed=%s", userviewed)};

        String s;
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(command);

        System.out.println("Here is the standard output of the command:\n");
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }
        BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        // Read any errors from the attempted command
        System.out.println("Here is the standard error of the command (if any):\n");
        while ((s = stdError.readLine()) != null) {
            System.out.println(s);
        }
    }

    private void UpdateRecommend(String username, int k, int maxusers) throws IOException {
        String[] command = {"python", String.format("%s/src/main/recommendmodel/recommend.py", this.workingdir),
                String.format("%s/src/main/data", this.workingdir), "recommend", String.format("--username=%s", username),
                String.format("--k=%o", k), String.format("--maxusers=%o", maxusers)};

        String s;
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(command);

        System.out.println("Here is the standard output of the command:\n");
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }
        BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        // Read any errors from the attempted command
        System.out.println("Here is the standard error of the command (if any):\n");
        while ((s = stdError.readLine()) != null) {
            System.out.println(s);
        }
    }

    private void UpdateRecommend(String username, int maxusers) throws IOException {
        String[] command = {"python", String.format("%s/src/main/recommendmodel/recommend.py", this.workingdir),
                String.format("%s/src/main/data", this.workingdir), "recommend", String.format("--username=%s", username),
                String.format("--maxusers=%o", maxusers)};

        String s;
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(command);

        System.out.println("Here is the standard output of the command:\n");
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }
        BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        // Read any errors from the attempted command
        System.out.println("Here is the standard error of the command (if any):\n");
        while ((s = stdError.readLine()) != null) {
            System.out.println(s);
        }
    }

    private void UpdateRecommend(String username) throws IOException {
        String[] command = {"python", String.format("%s/src/main/recommendmodel/recommend.py", this.workingdir),
                String.format("%s/src/main/data", this.workingdir), "recommend", String.format("--username=%s", username)};

        String s;
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec(command);

        System.out.println("Here is the standard output of the command:\n");
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
        while ((s = stdInput.readLine()) != null) {
            System.out.println(s);
        }
        BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        // Read any errors from the attempted command
        System.out.println("Here is the standard error of the command (if any):\n");
        while ((s = stdError.readLine()) != null) {
            System.out.println(s);
        }
    }

    public List<User> Popular(String username, int k) throws IOException, InvalidAttributeValueException {
        UpdatePopular(username, k);
        List<User> popular = db.LoadAllUser("popular");
        return popular;
    }

    public List<User> Popular(String username) throws IOException, InvalidAttributeValueException {
        UpdatePopular(username);
        List<User> popular = db.LoadAllUser("popular");
        return popular;
    }

    public List<User> Similar(String username, String userviewed) throws IOException, InvalidAttributeValueException {
        UpdateSimilar(username, userviewed);
        List<User> recommended = db.LoadAllUser("similar");
        return recommended;
    }

    public List<User> Similar(String username, String userviewed, int k) throws IOException, InvalidAttributeValueException {
        UpdateSimilar(username, userviewed, k);
        List<User> recommended = db.LoadAllUser("similar");
        return recommended;
    }

    public Map<String, List<User>> Recommend(String username, int k, int maxusers) throws IOException, InvalidAttributeValueException {
        UpdateRecommend(username, k, maxusers);
        List<User> recommend = db.LoadAllUser("recommend");
        List<User> recommendbase = db.LoadAllUser("recommendbase");
        Map<String, List<User>> recommendInfo = new HashMap<>();
        recommendInfo.put("recommend", recommend);
        recommendInfo.put("recommendbase", recommendbase);
        return recommendInfo;
    }

    public Map<String, List<User>> Recommend(String username, int maxusers) throws IOException, InvalidAttributeValueException {
        UpdateRecommend(username, maxusers);
        List<User> recommend = db.LoadAllUser("recommend");
        List<User> recommendbase = db.LoadAllUser("recommendbase");
        Map<String, List<User>> recommendInfo = new HashMap<>();
        recommendInfo.put("recommend", recommend);
        recommendInfo.put("recommendbase", recommendbase);
        return recommendInfo;
    }

    public Map<String, List<User>> Recommend(String username) throws IOException, InvalidAttributeValueException {
        UpdateRecommend(username);
        List<User> recommend = db.LoadAllUser("recommend");
        List<User> recommendbase = db.LoadAllUser("recommendbase");
        Map<String, List<User>> recommendInfo = new HashMap<>();
        recommendInfo.put("recommend", recommend);
        recommendInfo.put("recommendbase", recommendbase);
        return recommendInfo;
    }



}
