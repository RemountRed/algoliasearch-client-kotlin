package com.algolia.search.model.settings

import com.algolia.search.serialize.asJsonInput
import com.algolia.search.serialize.asJsonOutput
import kotlinx.serialization.*
import kotlinx.serialization.json.JsonLiteral


@Serializable(Distinct.Companion::class)
public sealed class Distinct {

    public object True : Distinct()

    public object False : Distinct()

    public data class Value(val count: Int) : Distinct() {

        init {
            if (count < 0) throw IllegalArgumentException("Distinct must be a positive integer")
        }
    }

    @Serializer(Distinct::class)
    internal companion object : KSerializer<Distinct> {

        override fun serialize(encoder: Encoder, obj: Distinct) {
            val json = when (obj) {
                is True -> JsonLiteral(true)
                is False -> JsonLiteral(false)
                is Value -> JsonLiteral(obj.count)
            }
            encoder.asJsonOutput().encodeJson(json)
        }

        override fun deserialize(decoder: Decoder): Distinct {
            val json = decoder.asJsonInput()
            val int = json.primitive.intOrNull

            if (int != null) {
                return when (int) {
                    0 -> False
                    1 -> True
                    else -> Value(int)
                }
            }
            return json.primitive.boolean.let { if (it) True else False }
        }
    }
}