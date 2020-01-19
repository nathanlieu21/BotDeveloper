import Commands.inviteCommand;
import Commands.mentionMembers;
import adminCommands.demote;
import adminCommands.kickCommand;
import adminCommands.muteCommand;
import adminCommands.promote;
import events.*;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {
    public static void main (String []args) throws Exception
    {
        JDA jda = new JDABuilder("NjQ0NTcxNTYwMzE3MDI2Mzcz.Xhs_dg.K_XhOXg-CNrNkthgsK7hC0YmUL8").build();
        //JDA jda = new JDABuilder("NjQ0NTcxODMwODE1ODE3NzQw.Xhs9nw.6_6_2adVGD9dEzZL6mHoc9ElXoU").build();// creates bot
       //JDA jda2 = new JDABuilder("NjQzODc5NTQ0NzcxNTc1ODEw.Xhs-eA.Xg_SZC5DRPcFfJPHZYw25W7OGFQ").build(); // tester bot
        jda.addEventListener(new muteCommand());
        jda.addEventListener(new EventHelper());
        jda.addEventListener(new inviteCommand());
        jda.addEventListener(new foulFilter());
        jda.addEventListener(new kickCommand());
        jda.addEventListener(new joinChannel());
        jda.addEventListener(new leaveChannel());
        jda.addEventListener(new mentionMembers());
        jda.addEventListener(new promote());
        jda.addEventListener(new demote());



    }
}
