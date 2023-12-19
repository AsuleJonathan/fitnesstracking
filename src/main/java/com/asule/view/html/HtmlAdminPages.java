package com.asule.view.html;


import com.asule.app.model.entity.MembershipManagement;
import com.asule.app.model.entity.User;

public class HtmlAdminPages {

    public static String adminHomePage(String adminMemberForm){
        return " <div class=\"formMainContainer\">\n" +
                "      <div class=\"createMemberContainer\">\n" +
                "        <p class=\"MemberTitle\">Create Member</p>\n" +
                "\n" +
                adminMemberForm +
                "      </div>\n" +
                "    </div>";
    }

    public static String adminMembersPage(String adminUpcomingMembers){
        return "<div class=\"mainMemberContainer\">\n" +
                "      <!-- top part -->\n" +
                "      <!-- bottom part  -->\n" +
                "      <div class=\"MemberAdminContainer\">\n" +
                "        <!-- each Member div -->\n" +
                adminUpcomingMembers +
                "      </div>\n" +
                "    </div>";
    }

    public static String adminMembershipManageListPage(String MembershipListPage){
        return "   <div class=\"MembershipPricingContainer\">\n" +
                "      <div class=\"createMemberContainer\">\n" +
                "        <p class=\"MemberTitle\">Membership Management List</p>\n" +
                "\n" +
                "        <!-- Membership table -->\n" +
                "       <div class=\"tablePricing\">\n" +
                MembershipListPage +
                "      </div>\n" +
                "  \n" +
                "        </div>\n" +
                "      </div>\n" +
                "\n" +
                "      </div>\n" +
                "    </div>";
    }

    public static String adminMemberReport(){
        return "    <div class=\"adminTableContainer\">\n" +
                "      <p class=\"MemberTitleTable\">Membership Report</p>\n" +
                "      <table>\n" +
                "        <tr>\n" +
                "          <th>Field</th>\n" +
                "          <th>Data</th>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "          <td>Member</td>\n" +
                "          <td>Gor vs AFC - 11/11/2023</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "          <td>Member Type</td>\n" +
                "          <td>Kenya Premier League</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "          <td>Total Allocated Memberships</td>\n" +
                "          <td>1000</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "          <td>Total Sold</td>\n" +
                "          <td>500</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "          <td>Not Sold</td>\n" +
                "          <td>500</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "          <td>Normal Memberships sold</td>\n" +
                "          <td>100</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "          <td>Normal generated outcome</td>\n" +
                "          <td>10,000</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "          <td>VIP Memberships sold</td>\n" +
                "          <td>50</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "          <td>vip generated outcome</td>\n" +
                "          <td>7,000</td>\n" +
                "        </tr>\n" +
                "        <tr>\n" +
                "          <td>Total generated outcome</td>\n" +
                "          <td>70,000</td>\n" +
                "        </tr>\n" +
                "      </table>\n" +
                "      <div class=\"MembershipReportButton\">\n" +
                "        <a href=\"#\" class=\"MembershipReportOneButton\">Download</a>\n" +
                "      </div>\n" +
                "    </div>";
    }

    public static String adminUserReport(String userReportPage){
        return  "   <div class=\"adminTableContainer\">\n" +
                "      <p class=\"MemberTitleTable\">Users Report</p>\n" +
                "\n" +
                userReportPage +
                "      <div class=\"MembershipReportButton\">\n" +
                "        <a href=\"#\" class=\"MembershipReportOneButton\">Download</a>\n" +
                "      </div>\n" +
                "    </div>";
    }
}
