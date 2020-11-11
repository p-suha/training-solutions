package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private List<Member> connections = new ArrayList<>();
    private String name;

    public Member (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Member> getConnections() {

        return connections;
    }


    public void connectMember(Member member) {
            connections.add(member);

    }
}
