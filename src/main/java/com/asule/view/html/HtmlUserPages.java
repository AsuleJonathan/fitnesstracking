package com.asule.view.html;

import java.io.Serializable;

public class HtmlUserPages implements Serializable {

    public static String homePage(){

        return " <div class=\"mainContainer\">\n" +
                "      <div class=\"heroSection\">\n" +
                "        <div class=\"sectionTitle\">\n" +
                "          <p>\n" +
                "            Experience The <br />\n" +
                "            <span class=\"blueText\">Thrill of Live Sports </span> <br />\n" +
                "            Like Never Before\n" +
                "          </p>\n" +
                "        </div>\n" +
                "        <div>\n" +
                "          <p class=\"summary\">\n" +
                "            Experience the ultimate in live entertainment with our seamless\n" +
                "            Membershiping system. Get ready to secure your spot at the heart of the\n" +
                "            action\n" +
                "          </p>\n" +
                "        </div>\n" +
                "        <div class=\"homeButtons\">\n" +
                "            <a href=\"./Memberships\" class=\"homeOutlineButton\" >  My Memberships</a>\n" +
                "            <a href=\"./Members\" class=\"homeNormalButton\">Upcoming Members</a>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "      <div class=\"heroImage\">\n" +
                "        <div class=\"imageContainer\">\n" +
                "          <img class=\"bgImage\" src=\"https://images.unsplash.com/photo-1522778526097-ce0a22ceb253?auto=format&fit=crop&q=80&w=1470&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D\" alt=\"stadium\">\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>";
    };

    public static String titleHeader(String titlePage){
        return "    <div class=\"mainMemberContainer\">\n" +
                "      <!-- top part -->\n" +
                "      <div class=\"topPart\">\n" +
                "        <div class=\"topPartTitle\">\n" +
                "<p>" +
               titlePage +
                "</p>" +
                "        </div>\n" +
                "      </div>\n" +
                "      <!-- bottom part  -->\n" +
                "      <div class=\"MemberContainer\">\n" +
                "        <!-- each Member div -->\n";
    }

    public static String titleClosingTags(){
        return "</div>\n" +
                "</div>";
    }

    public static String bookMembershipPage(String bookMembershipForm){
        return "<div class=\"mainMembershipBookContainer\"> \n" +
                bookMembershipForm +
                "</div>";
    }

    public static String myMembershipsPage(){
        return "<div class=\"topMembershipPart\">\n" +
                "        <div class=\"topMembershipPartTitle\">\n" +
                "          <p>My Memberships</p>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    <div class=\"mainMembershipContainer\">\n" +
                "      \n" +
                "        <div class=\"MemberCard\">\n" +
                "            <div>\n" +
                "                <img width=\"50\" height=\"50\" src=\"https://img.icons8.com/ios-filled/50/football2--v1.png\" alt=\"football2--v1\"/>\n" +
                "            </div>\n" +
                "            <div class=\"MembershipInfoDetails\">\n" +
                "                <p class=\"kpl\">Kenya Premier League</p>      \n" +
                "                <p class=\"game\">Gor Mahia vs Afc Leopards</p>\n" +
                "                <p>MISC Kasarani</p>\n" +
                "              </div>  \n" +
                "           <div>\n" +
                "            <p>Membership Number: 1001</p>\n" +
                "           </div>  \n" +
                "           <div>\n" +
                "            <div class=\"myMembershipNormalButton\">\n" +
                "                <a href=\"./Membershipdetails\">Membership Details</a> \n" +
                "            </div>\n" +
                "           </div>          \n" +
                "        </div>\n" +
                "        <div class=\"MemberCard\">\n" +
                "            <div>\n" +
                "                <img width=\"50\" height=\"50\" src=\"https://img.icons8.com/ios-filled/50/football2--v1.png\" alt=\"football2--v1\"/>\n" +
                "            </div>\n" +
                "            <div class=\"MembershipInfoDetails\">\n" +
                "                <p class=\"kpl\">Mozzart Cup</p>      \n" +
                "                <p class=\"game\">Gor Mahia vs Afc Leopards</p>\n" +
                "                <p>Nyayo stadium</p>\n" +
                "              </div>  \n" +
                "           <div>\n" +
                "            <p>Membership Number: 1001</p>\n" +
                "           </div>  \n" +
                "           <div>\n" +
                "            <div class=\"myMembershipNormalButton\">\n" +
                "                <a href=\"./Membershipdetails\">Membership Details</a> \n" +
                "            </div>\n" +
                "           </div>          \n" +
                "        </div>\n" +
                "    </div>";
    }

    public static String MembershipDetailsPage(){
        return  " <div class=\"MembershipBodyContainer\">\n" +
                "      <div class=\"MembershipDetailsTitle\">\n" +
                "        <p>Membership Details</p>\n" +
                "      </div>\n" +
                "      <div class=\"mainOneMembershipContainer\">\n" +
                "        <div class=\"oneMembershipTop\">\n" +
                "          <div class=\"topOneMembershipPart\">\n" +
                "            <div class=\"imagePart\">\n" +
                "              <img\n" +
                "                src=\"https://footballkenya.org/wp-content/uploads/2019/09/FKF-Website-Header-Logo-300x120.png\"\n" +
                "                alt=\"Logo\"\n" +
                "              />\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          <div class=\"bottomMembershipPart\">\n" +
                "            <div class=\"gameStyling\">\n" +
                "              <div class=\"MemberType\">\n" +
                "                <p class=\"kpl\">Kenya Premier League</p>\n" +
                "                <p class=\"game\">Gor Mahia vs Afc Leopards</p>\n" +
                "                <p class=\"date\">3/11/2023</p>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "            <div class=\"fineMembershipDetails\">\n" +
                "              <div class=\"leftPart\">\n" +
                "                <div class=\"MembershipType\">\n" +
                "                  <p>Type: VIP</p>\n" +
                "                </div>\n" +
                "\n" +
                "                <div class=\"amount\">\n" +
                "                  <p>Amount: 500</p>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "              <div class=\"rightPart\">\n" +
                "                <div class=\"MembershipNumber\">\n" +
                "                  <p>Membership Number: 1001</p>\n" +
                "                </div>\n" +
                "                <div class=\"kickOff\">\n" +
                "                  <p>Kick Off: 1300 hrs</p>\n" +
                "                </div>\n" +
                "                <div class=\"location\">\n" +
                "                  <p>Location: Kasarani</p>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "      <div class=\"MembershipButtons\">\n" +
                "        <a href=\"./Memberships\" class=\"MembershipNormalButton\">Back</a>\n" +
                "        <a href=\"#\" class=\"MembershipOutlineButton\">Download</a>\n" +
                "      </div>\n" +
                "    </div>";
    }
}
