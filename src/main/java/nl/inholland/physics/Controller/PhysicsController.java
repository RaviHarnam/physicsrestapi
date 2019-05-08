package nl.inholland.physics.Controller;

import nl.inholland.physics.Model.Physics;
import nl.inholland.physics.Service.PhysicsTopicService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/physics")
public class PhysicsController {

    private PhysicsTopicService service;

    public PhysicsController(PhysicsTopicService service) {
        this.service = service;
    }

    @RequestMapping(value= "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Physics> getAllPhysicsTopics() {
        return service.getPhysicstopics();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Physics getPhysicsTopicById(@PathVariable String id) {
        return service.getPhysicsTopic(id);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addPhysicsTopic(@RequestBody Physics physics) {
        service.addPhysicsTopic(physics);
    }
}
