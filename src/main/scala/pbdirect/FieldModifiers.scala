package pbdirect

/**
 * Modifiers for how a field should be encoded,
 * derived from annotations such as @pbUnpacked.
 */
final case class FieldModifiers(
    unpacked: Boolean
)
