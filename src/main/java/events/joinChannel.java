package events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class joinChannel extends ListenerAdapter {

    public void onGuildMemberJoin(GuildMemberJoinEvent event )
    {

        EmbedBuilder helper = new EmbedBuilder();// default for embed
        helper.setTitle("\uD83C\uDF46" + "We have lost a member of our team: " + event.getMember().getAsMention());
        helper.setDescription("We wish you the best");
        helper.setColor(0xC64134);
        event.getGuild().getDefaultChannel().sendMessage(helper.build()).queue();
        event.getGuild().modifyMemberRoles(event.getMember(), event.getGuild().getRolesByName("Member", true)).complete();
    }
}
