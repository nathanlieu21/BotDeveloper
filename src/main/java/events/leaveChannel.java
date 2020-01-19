package events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.guild.member.GuildMemberLeaveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class leaveChannel extends ListenerAdapter {
    public void onGuildMemberLeave(GuildMemberLeaveEvent event)
    {
        EmbedBuilder helper = new EmbedBuilder();// default for embed
        helper.setTitle("\uD83C\uDF46" + "Welcome to Discord tester server: " + event.getMember().getAsMention());
        helper.setDescription("Feel free to use $help command to see all user commands avaible");
        helper.addField("Creator","Nathan Lieu The Second Hokage Of The Leaf Village",false);
        helper.setColor(0xC64134);
        event.getGuild().getDefaultChannel().sendMessage(helper.build()).queue();
    }
}
