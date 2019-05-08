package nl.inholland.physics.Model;

public class Physics {

    String id;
    String physicsCategory;
    String topic;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhysicsCategory() {
        return physicsCategory;
    }

    public void setPhysicsCategory(String physicsCategory) {
        this.physicsCategory = physicsCategory;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }


    public Physics(String id, String physicsCategory, String topic)
    {
        this.id = id;
        this.physicsCategory = physicsCategory;
        this.topic = topic;
    }

    public Physics(){}

    @Override
    public String toString() {
        return "Physics{" + "id='"+ id + '\'' + ", physicscategory ='" + physicsCategory + '\'' + ", topic='" + topic + '\''+'}';
    }


}
