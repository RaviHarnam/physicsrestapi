package nl.inholland.physics.Service;

import nl.inholland.physics.Model.Physics;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PhysicsTopicService {

List<Physics> physicstopics = new ArrayList<>(Arrays.asList(
        new Physics("1", "Astronomy", "Black hole has been photographed!" ),
        new Physics("2", "Quantum Mechanics", "Higgs particle have beend found!"),
        new Physics("3", "Astronomy", "Gravitational waves have been detected!"),
        new Physics("4", "Quantum Mechanics", "LHC is smashing particles!"))
    );

    public List<Physics> getPhysicstopics() {
        return physicstopics;
    }

    public Physics getPhysicsTopic(String id) {
        for (Physics physics : physicstopics) {
            if(physics.getId().equals(id)) {
                return physics;
            }
        }
        return null;
    }

    public void addPhysicsTopic(Physics physics) {
        physicstopics.add(physics);
    }
}
