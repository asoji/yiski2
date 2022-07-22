package one.devos.discord.yiski2

import com.kotlindiscord.kord.extensions.ExtensibleBot
import one.devos.discord.yiski2.extensions.TestExtension

suspend fun main() {
    val bot = ExtensibleBot(BOT_TOKEN) {
        extensions {
            add(::TestExtension)
        }

        presence {
            playing("when Yiski1 isn't enough")
        }
    }

    bot.start()
}
