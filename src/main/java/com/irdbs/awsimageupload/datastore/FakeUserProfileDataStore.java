package com.irdbs.awsimageupload.datastore;

import com.irdbs.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES=new ArrayList<>();
    static{
        USER_PROFILES.add(new UserProfile(UUID.fromString("a1a7c954-1cd2-45fd-9ac5-d65992e992bb"),"farukahmet",null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("39db64bc-ad80-4733-884f-b7aa21787901"),"aysun06",null));
    }
    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
