class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            int splitIndex = email.indexOf("@");
            String local = email.substring(0,splitIndex);
            String domain = email.substring(splitIndex);

            int plusIndex = local.indexOf("+");
            if (plusIndex != -1) {
                local = local.substring(0, plusIndex);
            }
            local = local.replace(".","");

            uniqueEmails.add(local+domain);
        }
        return uniqueEmails.size();
    }
}