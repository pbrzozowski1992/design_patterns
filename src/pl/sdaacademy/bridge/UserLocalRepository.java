package pl.sdaacademy.bridge;


public class UserLocalRepository extends LocalRepository<User> {

    @Override
    public String getRepositoryName() {
        return "User repository";
    }
}
