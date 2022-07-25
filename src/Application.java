public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        KYCVerification kycDetails1 = new KYCVerification("Pan number 1", 1, "Passport", "10014");
        Account account1 = new Account(1, "Darius 1", "password", 0, kycDetails1, null, 0);

        application.submitUserDetails(account1);
        application.doDepositOperation(account1);
        application.doWithdrawalOperation(account1);
        application.printUserAllDetails(account1);
        application.printUserContactDetails(account1);
        application.changeEmailId(account1, "newEmailId");
        application.changeMobileNumber(account1, 20424244);

    }

    public void submitUserDetails(Account account){
        ContactDetails contactDetails1 = new ContactDetails("House no 1", "Varfuri", "Pucioasa", "Romania", 42409, 400000000);
        account.setContactDetails(contactDetails1);

    }

    public void doDepositOperation(Account account){
        System.out.println("Initial balance: " + account.getBalance());
        System.out.println("Balance after deposit 50000");
        System.out.println(account.deposit(50000));
    }

    public void doWithdrawalOperation(Account account){
        System.out.println("Balance after withdrawing 300");
        System.out.println(account.withdrawal(300));
        System.out.println("Balance after withdrawing 60000");
        System.out.println(account.withdrawal(60000));
    }

    public void printUserAllDetails(Account account){
        ContactDetails contactDetails = account.getContactDetails();
        System.out.println(contactDetails.getCityName() + " " + contactDetails.getCountryName() + " " + contactDetails.getHouseNumber());
        System.out.println(contactDetails.getLocalityName() + " " + contactDetails.getMobileNumber() + " " + contactDetails.getPinCode());

    }

    public void printUserContactDetails(Account account){
        ContactDetails contactDetails = account.getContactDetails();
        System.out.println(contactDetails.getMobileNumber());

    }

    public void printUserKYCDocuments(Account account){
        KYCVerification kycVerification = account.getKycDetails();
        System.out.println(kycVerification.getDocumentNumber());
    }

    public void changeMobileNumber(Account account, long newMobilePhoneNumber){
        account.getContactDetails().setMobileNumber(newMobilePhoneNumber);

    }

    public void changeEmailId(Account account, String newEmailId){
        account.getContactDetails().setEmailId(newEmailId);
    }
}
