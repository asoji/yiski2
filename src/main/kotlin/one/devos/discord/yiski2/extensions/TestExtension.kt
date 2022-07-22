package one.devos.discord.yiski2.extensions

import com.kotlindiscord.kord.extensions.extensions.Extension
import com.kotlindiscord.kord.extensions.extensions.publicSlashCommand
import com.kotlindiscord.kord.extensions.types.respond

class TestExtension : Extension() {
    override val name = "test"

    override suspend fun setup() {
        publicSlashCommand {
            name = "test"
            description = "Test command"

            action {
                respond {
                    content = "IMS is cringe"
                }
            }
        }
    }
}
