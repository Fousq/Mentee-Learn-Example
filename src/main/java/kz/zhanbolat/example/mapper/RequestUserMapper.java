package kz.zhanbolat.example.mapper;

public class RequestUserMapper implements EntityMapper<Request, User> {

    @Override
    public User map(Request arg) {
        User user = new User();
        arg.get("username").ifPresent(username -> user.setName(username));
        arg.get("password").ifPresent(password -> user.setPassword(password));
        return user;
    }
}
