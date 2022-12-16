package ConverterPattern;

import java.util.function.Function;

public class Converter<D, E> {

    // 从 D 转换为 E
    private Function<D, E> toEntity;
    // 从 E 转换为 D
    private Function<E, D> toDto;

    public Converter(final Function<D, E> toEntity, final Function<E, D> toDto) {
        this.toEntity = toEntity;
        this.toDto = toDto;
    }

    public final E dto2entity(final D dto) {
        return toEntity.apply(dto);
    }

    public final D entity2dto(final E entity) {
        return toDto.apply(entity);
    }
}