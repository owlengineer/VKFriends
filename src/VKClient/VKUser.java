package VKClient;

public class VKUser {
    public int userId;
    public String firstName;
    public String lastName;
    public String photoUrl;
    public int sex;
    public String bdate;
    public int relation;
    public String education;

    public VKUser(
            int userId,
            String firstName,
            String lastName,
            String url)
    {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.photoUrl = url;
        sex = 0;
        bdate = "-";
        relation = 0;
        education = "-";
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + userId;
    }

    @Override
    public boolean equals(Object obj) {
        VKUser tmp = (VKUser)obj;
        if (tmp.userId == this.userId)
            return true;
        return false;
    }

    public String getSex() {
        if(sex == 2)
            return "man";
        else if(sex == 1)
            return "woman";
        else
            return "transhomosek";
    }

    public String getRelation()
    {
        switch (relation)
        {
            case 1:
                return "not married";
            case 2:
                return "boyfriend/girlfriend";
            case 3:
                return "engaged";
            case 4:
                return "married";
            case 5:
                return "complicated";
            case 6:
                return "in binary search";
            case 7:
                return "still loving you";
            default:
                return "superunknown";
        }
    }

    public String getInfo()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: " + String.valueOf(userId) + "\n");
        sb.append("First Name: " + firstName + "\n");
        sb.append("Last Name: " + lastName + "\n");
        sb.append("Birth Date: " + bdate + "\n");
        sb.append("Relations: " + getRelation() + "\n");
        sb.append("Sex: " + getSex() + "\n");
        sb.append("University: " + education + "\n");
        return sb.toString();
    }
}
