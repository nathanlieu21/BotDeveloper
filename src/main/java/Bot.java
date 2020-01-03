import Commands.inviteCommand;
import adminCommands.kickCommand;
import events.EventHelper;
import events.foulFilter;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

import java.util.concurrent.ExecutionException;

public class Bot {
    public static void main (String []args) throws Exception
    {
        JDA jda = new JDABuilder("NjQzODc5NTQ0NzcxNTc1ODEw.Xc1efw.seL1AJSLtnUYbm0DP-qdSctQ7RI").build();// creates bot
        JDA jda2 = new JDABuilder("NjQ0NTcxODMwODE1ODE3NzQw.Xc1-VQ.YQ5yIWGxCD3hn_zT_r-GdYlGaLc").build(); // tester bot
        jda.addEventListener(new EventHelper());
        jda.addEventListener(new inviteCommand());
        jda.addEventListener(new foulFilter());
        jda.addEventListener(new kickCommand());




    }
}
