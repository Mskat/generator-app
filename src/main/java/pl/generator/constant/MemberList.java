package pl.generator.constant;

import pl.generator.model.Member;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MemberList {
    private List<Member> allMembersList = new ArrayList<>();

    // Getter
    public List<Member> getAllMembersList() throws IOException {
        String pathFile = "members.txt";
        String line;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(pathFile));
            while ((line = br.readLine()) != null) {
                String[] member = line.split(",");
                Member newMember = new Member(member[0], member[1], Level.valueOf(member[2]));
                allMembersList.add(newMember);
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }
        return allMembersList;
    }
}
