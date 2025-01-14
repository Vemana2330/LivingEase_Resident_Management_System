package business.Organisation;

import business.UserAccount.UserAccount;
import business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

public class OrganisationDirectory {

    private ArrayList<Organisation> OrganisationList;

    public OrganisationDirectory() {
        OrganisationList = new ArrayList<>();
    }

    public ArrayList<Organisation> getOrganisationList() {
        return OrganisationList;
    }

    public Organisation createorganisation(String name) {
        Organisation organisation = new Organisation();
        organisation.setName(name);
        OrganisationList.add(organisation);
        return organisation;
    }

}
